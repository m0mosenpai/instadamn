package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.UyX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67798UyX extends C3DB {
    public C45047Jwc A00;
    public C45028JwJ A01;
    public Boolean A02;
    public Boolean A03;
    public Long A04;
    public List A05;
    public List A06;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C45047Jwc c45047Jwc = this.A00;
        if (c45047Jwc == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c45047Jwc;
    }
}
