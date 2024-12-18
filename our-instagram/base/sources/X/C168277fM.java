package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168277fM extends AbstractC72023La {
    public C169417hF A00;
    public C169397hD A01;
    public GraphGuardianContentImpl A02;
    public C168287fN A03;
    public C169437hJ A04;
    public C38321qM A05;
    public C115895Mf A06;
    public User A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public boolean A0j;
    public long A0l = -1;
    public long A0k = -1;

    @Override // X.AbstractC72023La, X.InterfaceC55612h1
    public final void EQh(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A0k;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A0l;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A0l == -1) {
            return false;
        }
        return true;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C168287fN c168287fN = this.A03;
        if (c168287fN == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c168287fN;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A0k = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A0l = j;
    }
}
