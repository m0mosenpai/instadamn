package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC124285ji extends AbstractC72023La {
    public InterfaceC124225jb A01;
    public C111074zO A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public HashMap A08;
    public List A09;
    public List A0B;
    public long A00 = -1;
    public long A0C = -1;
    public List A0A = C16930sl.A00;

    @Override // X.AbstractC72023La, X.InterfaceC55612h1
    public final void EQh(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A0C;
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

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        InterfaceC124225jb interfaceC124225jb = this.A01;
        if (interfaceC124225jb == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return interfaceC124225jb;
    }

    public AbstractC124285ji() {
        C125905mf A00 = InterfaceC111084zP.A00.A00(false);
        A00.A00 = null;
        this.A02 = A00.A00();
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A0C = j;
    }

    @Override // X.InterfaceC55612h1
    public void EQi(long j) {
        this.A00 = j;
    }
}
