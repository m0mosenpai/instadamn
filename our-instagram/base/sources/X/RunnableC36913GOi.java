package X;

import android.os.Bundle;

/* renamed from: X.GOi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36913GOi implements Runnable {
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ C32286EJy A01;

    public RunnableC36913GOi(EDW edw, C32286EJy c32286EJy) {
        this.A01 = c32286EJy;
        this.A00 = edw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32286EJy c32286EJy = this.A01;
        C34649FOh c34649FOh = c32286EJy.A0E;
        if (c34649FOh == null) {
            C14360o3.A0F("userForEditing");
            throw C00O.createAndThrow();
        }
        String str = c34649FOh.A0M;
        String str2 = c34649FOh.A0B;
        String str3 = c34649FOh.A0H;
        Bundle A00 = C35002FbZ.A00(this.A00.A00);
        AbstractC31181DnP.A0R(A00, str2, str3, str, false);
        AbstractC34231F8d.A00(A00, EnumC33365Eoy.A04);
        A00.putBoolean("HAS_SMS_CONSENT", false);
        C140966Yy A0c = AbstractC25231BEo.A0c(c32286EJy.requireActivity(), c32286EJy.A0L);
        AbstractC31172DnG.A1A();
        A0c.A0B(A00, new C32271EJg());
        A0c.A0F(c32286EJy, 0);
        A0c.A04();
    }
}
