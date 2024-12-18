package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.util.List;

/* renamed from: X.UyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67797UyW extends C3DB {
    public Challenge A00;
    public ChallengeDetails A01;
    public GuidanceTipResponseImpl A02;
    public C25992Beg A03;
    public Long A04;
    public List A05;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C25992Beg c25992Beg = this.A03;
        if (c25992Beg == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c25992Beg;
    }
}
