package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.util.List;

/* renamed from: X.3LZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LZ extends AbstractC72023La {
    public C74433Vz A01;
    public IGUserHighlightsTrayType A02;
    public C114855Gv A03;
    public C3NK A04;
    public C37771pE A05;
    public C3NO A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public long A00 = -1;
    public long A0N = -1;

    @Override // X.C3DC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C3NO F7f() {
        C3NO c3no = this.A06;
        if (c3no == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c3no;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A0N;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A00 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A0N = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
