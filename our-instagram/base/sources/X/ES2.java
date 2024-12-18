package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ES2 extends AbstractC65632xz {
    public final Context A00;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int ordinal = ((MZV) obj).ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    anonymousClass306.A7a(2);
                    return;
                }
                return;
            }
            anonymousClass306.A7a(1);
            return;
        }
        anonymousClass306.A7a(0);
    }

    public ES2(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != 4) goto L12;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r5, android.view.View r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = 2087493766(0x7c6ca086, float:4.9145514E36)
            int r3 = X.C0f9.A03(r0)
            X.MZV r7 = (X.MZV) r7
            r0 = 2131431980(0x7f0b122c, float:1.8485705E38)
            android.view.View r2 = X.AbstractC31173DnH.A0D(r6, r0)
            int r1 = r7.ordinal()
            r0 = 0
            if (r1 == r0) goto L2e
            r0 = 1
            if (r1 == r0) goto L38
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 3
            if (r1 == r0) goto L2e
            r0 = 4
            if (r1 == r0) goto L2e
        L23:
            r0 = 1310820842(0x4e2189ea, float:6.775425E8)
            X.C0f9.A0A(r0, r3)
            return
        L2a:
            r0 = 2131239930(0x7f0823fa, float:1.809618E38)
            goto L3b
        L2e:
            android.content.Context r1 = r4.A00
            r0 = 2130970317(0x7f0406cd, float:1.754934E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            goto L3b
        L38:
            r0 = 2131239929(0x7f0823f9, float:1.8096179E38)
        L3b:
            r2.setBackgroundResource(r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES2.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A03 = C0f9.A03(1737036464);
        if (i != 0) {
            if (i != 1 && i != 2) {
                IllegalArgumentException A0n = AbstractC25230BEn.A0n("viewType does not exist: ", i);
                C0f9.A0A(1984022695, A03);
                throw A0n;
            }
            inflate = LayoutInflater.from(this.A00).inflate(R.layout.row_divider_dynamic_margin, viewGroup, false);
            i2 = 1513718453;
        } else {
            inflate = LayoutInflater.from(this.A00).inflate(R.layout.row_divider, viewGroup, false);
            i2 = 279650156;
        }
        C0f9.A0A(i2, A03);
        return inflate;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(AbstractC25228BEl.A1Y(i));
    }
}
