package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class SQC {
    public List A00;
    public int[] A01;

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00(int i) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(size);
                }
            } while (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 != i);
            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        }
        return null;
    }

    public final void A01() {
        int[] iArr = this.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.A00 = null;
    }

    public final void A02(int i) {
        int[] iArr = this.A01;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i < length) {
            return;
        }
        while (length <= i) {
            length *= 2;
        }
        int[] iArr3 = new int[length];
        this.A01 = iArr3;
        int length2 = iArr.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        int[] iArr4 = this.A01;
        Arrays.fill(iArr4, length2, iArr4.length, -1);
    }

    public final void A03(int i) {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(size)).A01 >= i) {
                    this.A00.remove(size);
                }
            }
        }
        A04(i);
    }

    public final void A04(int i) {
        int[] iArr;
        int length;
        int[] iArr2 = this.A01;
        if (iArr2 != null && i < iArr2.length) {
            if (this.A00 != null) {
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00 = A00(i);
                if (A00 != null) {
                    this.A00.remove(A00);
                }
                int size = this.A00.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(i2)).A01 >= i) {
                        if (i2 != -1) {
                            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(i2);
                            this.A00.remove(i2);
                            int i3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                            if (i3 != -1) {
                                iArr = this.A01;
                                length = Math.min(i3 + 1, iArr.length);
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            iArr = this.A01;
            length = iArr.length;
            Arrays.fill(iArr, i, length, -1);
        }
    }

    public final void A05(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A02(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.A01, i, i3, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(size);
                        int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                        if (i4 >= i) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 = i4 + i2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A06(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A02(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.A01;
            int length = iArr3.length;
            Arrays.fill(iArr3, length - i2, length, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.A00.get(size);
                        int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.A00.remove(size);
                            } else {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 = i4 - i2;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A07(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        List list = this.A00;
        if (list == null) {
            list = AbstractC166987dD.A1E();
            this.A00 = list;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            List list2 = this.A00;
            if (i < size) {
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) list2.get(i);
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A01 == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01) {
                    this.A00.remove(i);
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A01 >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01) {
                    this.A00.add(i, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    return;
                }
                i++;
            } else {
                list2.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
    }
}
