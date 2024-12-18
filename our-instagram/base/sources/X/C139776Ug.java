package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139776Ug implements C5GG {
    public final List A00 = new ArrayList(2);

    @Override // X.C5GG
    public final void DGB(Drawable drawable, Throwable th, long j) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DGB(drawable, th, j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DH1(Drawable drawable, C3QB c3qb, int i, long j) {
        List list = this.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((C5GG) list.get(i2)).DH1(drawable, c3qb, i, j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DMs(long j, Throwable th) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DMs(j, th);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DMu(C3QB c3qb, long j) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DMu(c3qb, j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DYq(Drawable drawable, long j) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DYq(drawable, j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DeX(long j) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DeX(j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.C5GG
    public final void DpW(long j, Object obj) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C5GG) list.get(i)).DpW(j, obj);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
