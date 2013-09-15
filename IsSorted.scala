def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
	as.length match {
		case 0 => true;
		case 1 => true;
		case _ => {
			if ((as(1) == (as(0))) || gt(as(1), as(0))) {
				isSorted(as.tail, gt)
			} else {
				false
			}
		}
	}
}
