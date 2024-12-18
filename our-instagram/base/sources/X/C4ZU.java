package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.4ZU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZU implements C4ZQ {
    public String A00;
    public boolean A04;
    public final InterfaceC56392iX A07;
    public InterfaceC16820sZ A01 = C4ZV.A00;
    public InterfaceC16620sF A03 = C4ZW.A00;
    public InterfaceC16660sJ A02 = C4ZX.A00;
    public C4ZT A06 = new C4ZT(null, null, null);
    public boolean A05 = true;

    public C4ZU(InterfaceC56392iX interfaceC56392iX) {
        this.A07 = interfaceC56392iX;
    }

    public static final ViewGroup A00(C4ZU c4zu) {
        View requireViewById = c4zu.A07.getView().requireViewById(R.id.translated_text_sticker_container);
        C14360o3.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static final C4ZT A01(C4ZU c4zu) {
        Integer num;
        C4ZT c4zt = c4zu.A06;
        if (c4zt.A00()) {
            return c4zt;
        }
        View view = (View) c4zu.A07.getView().getParent();
        Integer num2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
            num2 = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        C4ZT c4zt2 = new C4ZT(num, num2, 0);
        c4zu.A06 = c4zt2;
        return c4zt2;
    }

    public static final void A02(View view, View view2, C4ZT c4zt, C84823qW c84823qW, float f) {
        int i;
        int i2;
        Integer num = c4zt.A01;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = c4zt.A00;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        C138436Oz.A04(view, c84823qW, f, i, i2, true);
        C138436Oz.A04(view2, c84823qW, f, i, i2, false);
    }

    public final void A04(int i) {
        if (!this.A04 && this.A07.CGb() == 0) {
            this.A04 = true;
            this.A01.invoke();
        }
        this.A02.invoke(Float.valueOf(i));
    }

    @Override // X.C4ZQ
    public final boolean Cdl() {
        return this.A05;
    }

    @Override // X.C4ZQ
    public final boolean FCM(boolean z, boolean z2) {
        if (z == this.A05) {
            return false;
        }
        this.A05 = z;
        this.A03.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x006a, code lost:
    
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.common.session.UserSession r17, X.C4ZU r18, java.lang.Boolean r19, java.lang.Float r20, X.InterfaceC224417g r21) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4ZU.A03(com.instagram.common.session.UserSession, X.4ZU, java.lang.Boolean, java.lang.Float, X.17g):void");
    }
}
