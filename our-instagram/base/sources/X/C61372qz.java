package X;

import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Deprecated;

/* renamed from: X.2qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61372qz extends C1I2 {
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    @Deprecated(message = "")
    public final void A01(AbsListView.OnScrollListener onScrollListener) {
        C14360o3.A0B(onScrollListener, 0);
        ArrayList arrayList = this.A00;
        if (!arrayList.contains(onScrollListener)) {
            arrayList.add(onScrollListener);
        }
    }

    @Deprecated(message = "")
    public final void A02(C1I4 c1i4) {
        C14360o3.A0B(c1i4, 0);
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(c1i4)) {
            arrayList.add(c1i4);
        }
    }

    public final void A03(C1I2 c1i2) {
        C14360o3.A0B(c1i2, 0);
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(c1i2)) {
            arrayList.add(c1i2);
        }
    }

    public final void A00() {
        this.A00.clear();
        this.A01.clear();
        this.A02.clear();
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-751738089);
        C14360o3.A0B(c3fq, 0);
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A07(CFj);
        if (c3fq.CXX()) {
            ArrayList arrayList = this.A00;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i6 = size - 1;
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) arrayList.get(size);
                    C14360o3.A0A(onScrollListener);
                    Class<?> cls = onScrollListener.getClass();
                    String name = CFj.getClass().getName();
                    C14360o3.A07(name);
                    C14360o3.A0B(cls, 0);
                    int Enh = C2UQ.A00.Enh(cls, name);
                    onScrollListener.onScroll((AbsListView) CFj, i, i2, i3);
                    C2UQ.A00.ASX(Enh);
                    if (i6 < 0) {
                        break;
                    } else {
                        size = i6;
                    }
                }
            }
        } else {
            ArrayList arrayList2 = this.A01;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i7 = size2 - 1;
                    Object obj = arrayList2.get(size2);
                    C14360o3.A07(obj);
                    C1I4 c1i4 = (C1I4) obj;
                    Class<?> cls2 = c1i4.getClass();
                    String name2 = CFj.getClass().getName();
                    C14360o3.A07(name2);
                    C14360o3.A0B(cls2, 0);
                    int Enh2 = C2UQ.A00.Enh(cls2, name2);
                    c1i4.onScrolled((RecyclerView) CFj, i4, i5);
                    C2UQ.A00.ASX(Enh2);
                    if (i7 < 0) {
                        break;
                    } else {
                        size2 = i7;
                    }
                }
            }
        }
        ArrayList arrayList3 = this.A02;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i8 = size3 - 1;
                Object obj2 = arrayList3.get(size3);
                C14360o3.A07(obj2);
                C1I2 c1i2 = (C1I2) obj2;
                Class<?> cls3 = c1i2.getClass();
                String name3 = CFj.getClass().getName();
                C14360o3.A07(name3);
                C14360o3.A0B(cls3, 0);
                int Enh3 = C2UQ.A00.Enh(cls3, name3);
                c1i2.onScroll(c3fq, i, i2, i3, i4, i5);
                C2UQ.A00.ASX(Enh3);
                if (i8 < 0) {
                    break;
                } else {
                    size3 = i8;
                }
            }
        }
        C0f9.A0A(-1820687610, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(305212597);
        C14360o3.A0B(c3fq, 0);
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A07(CFj);
        if (c3fq.CXX()) {
            ArrayList arrayList = this.A00;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) arrayList.get(size);
                    C14360o3.A0A(onScrollListener);
                    Class<?> cls = onScrollListener.getClass();
                    String name = CFj.getClass().getName();
                    C14360o3.A07(name);
                    C14360o3.A0B(cls, 0);
                    int Eni = C2UQ.A00.Eni(cls, name, i);
                    onScrollListener.onScrollStateChanged((AbsListView) CFj, i);
                    C2UQ.A00.ASY(Eni);
                    if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
        } else {
            ArrayList arrayList2 = this.A01;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    Object obj = arrayList2.get(size2);
                    C14360o3.A07(obj);
                    C1I4 c1i4 = (C1I4) obj;
                    Class<?> cls2 = c1i4.getClass();
                    String name2 = CFj.getClass().getName();
                    C14360o3.A07(name2);
                    C14360o3.A0B(cls2, 0);
                    int Eni2 = C2UQ.A00.Eni(cls2, name2, i);
                    c1i4.onScrollStateChanged((RecyclerView) CFj, i);
                    C2UQ.A00.ASY(Eni2);
                    if (i3 < 0) {
                        break;
                    } else {
                        size2 = i3;
                    }
                }
            }
        }
        ArrayList arrayList3 = this.A02;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i4 = size3 - 1;
                Object obj2 = arrayList3.get(size3);
                C14360o3.A07(obj2);
                Class<?> cls3 = obj2.getClass();
                String name3 = CFj.getClass().getName();
                C14360o3.A07(name3);
                C14360o3.A0B(cls3, 0);
                int Eni3 = C2UQ.A00.Eni(cls3, name3, i);
                ((C1I2) arrayList3.get(size3)).onScrollStateChanged(c3fq, i);
                C2UQ.A00.ASY(Eni3);
                if (i4 < 0) {
                    break;
                } else {
                    size3 = i4;
                }
            }
        }
        C0f9.A0A(-1268534572, A03);
    }
}
