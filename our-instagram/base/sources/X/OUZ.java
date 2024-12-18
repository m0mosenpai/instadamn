package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OUZ {
    public O56 A00;
    public final Context A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0B = C57524Pfy.A00(this, 26);
    public Integer A01 = C05F.A00;
    public final InterfaceC09390do A08 = C57524Pfy.A00(this, 24);
    public final InterfaceC09390do A07 = C57524Pfy.A00(this, 23);
    public final InterfaceC09390do A0D = C57524Pfy.A00(this, 28);
    public final InterfaceC09390do A03 = C57524Pfy.A00(this, 20);
    public final InterfaceC09390do A0C = C57524Pfy.A00(this, 27);
    public final InterfaceC09390do A06 = C57524Pfy.A00(this, 22);
    public final InterfaceC09390do A0A = C57524Pfy.A00(this, 25);

    public static final C54792OJk A00(OUZ ouz) {
        InterfaceC09390do interfaceC09390do = ouz.A05;
        if (interfaceC09390do.CWa()) {
            return (C54792OJk) interfaceC09390do.getValue();
        }
        return null;
    }

    public OUZ(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm) {
        this.A02 = context;
        this.A04 = C57524Pfy.A00(view, 21);
        this.A05 = C1XM.A00(new C43210J8h(8, this, c57112jm, userSession));
        this.A09 = C1XM.A00(new C57536PgA(29, interfaceC11380iw, this));
    }
}
