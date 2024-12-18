package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161677Mc extends AbstractC161687Md {
    public final C3OO A00;
    public final AbstractC66422zJ A01;

    public InterfaceC66482zP A04(C7VC c7vc) {
        if (this instanceof AbstractC161727Mh) {
            return ((AbstractC161727Mh) this).A05((C160787Im) c7vc);
        }
        if (this instanceof AbstractC161667Mb) {
            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) c7vc;
            C14360o3.A0B(interfaceC66482zP, 0);
            return interfaceC66482zP;
        }
        if (this instanceof C1584979j) {
            C1584979j c1584979j = (C1584979j) this;
            InterfaceC162527Pp interfaceC162527Pp = c1584979j.A02;
            Context context = c1584979j.itemView.getContext();
            UserSession userSession = c1584979j.A00;
            C18A c18a = c1584979j.A05;
            return interfaceC162527Pp.AWm(context, userSession, c1584979j.A03, c7vc, c1584979j.A04, c18a, false);
        }
        C75Z c75z = (C75Z) this;
        C14360o3.A0B(c7vc, 0);
        C1574575b c1574575b = c75z.A01;
        Context context2 = c75z.itemView.getContext();
        C14360o3.A07(context2);
        UserSession userSession2 = c75z.A00;
        C18A c18a2 = c75z.A04;
        return c1574575b.AWm(context2, userSession2, c75z.A02, c7vc, c75z.A03, c18a2, false);
    }

    public AbstractC161677Mc(C3OO c3oo, AbstractC66422zJ abstractC66422zJ) {
        super(c3oo.itemView);
        this.A00 = c3oo;
        this.A01 = abstractC66422zJ;
    }

    @Override // X.AbstractC161687Md
    public void A02() {
        this.A01.unbind(this.A00);
    }

    @Override // X.AbstractC161687Md
    public void A03(C7VC c7vc) {
        this.A01.bind(A04(c7vc), this.A00);
    }
}
