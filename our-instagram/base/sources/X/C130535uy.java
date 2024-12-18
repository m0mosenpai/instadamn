package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130535uy {
    public int A00;
    public C9CJ A02;
    public InterfaceC111084zP A03;
    public C120985dq A04;
    public EnumC132885zD A06;
    public EnumC132895zE A07;
    public String A08;
    public String A09;
    public String A0B;
    public String A0C;
    public List A0E;
    public boolean A0F;
    public String A0A = "";
    public String A0D = "";
    public EnumC130545uz A05 = EnumC130545uz.A05;
    public int A01 = -1;

    public final List A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36318526923282675L)) {
            return AbstractC128065qa.A05(userSession, A02());
        }
        return AbstractC128065qa.A07(A02());
    }

    public final void A04(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C111034zF A00 = AbstractC128065qa.A00((C120985dq) it.next());
            if (A00 != null) {
                A02().add(A00);
            }
        }
    }

    public final C120985dq A00() {
        if (this.A00 >= A02().size()) {
            this.A00 = 0;
        }
        return AbstractC128065qa.A02((InterfaceC111044zG) A02().get(this.A00));
    }

    public final EnumC132895zE A01() {
        EnumC132895zE enumC132895zE = this.A07;
        if (enumC132895zE != null) {
            return enumC132895zE;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw C00O.createAndThrow();
    }

    public final List A02() {
        List list = this.A0E;
        if (list != null) {
            return list;
        }
        C14360o3.A0F("clips");
        throw C00O.createAndThrow();
    }
}
