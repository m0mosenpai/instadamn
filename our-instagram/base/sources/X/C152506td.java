package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import java.util.List;

/* renamed from: X.6td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152506td extends C3DB {
    public AvatarCoinFlipBackgroundOptionResponse A00;
    public C152556ti A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;

    @Override // X.C3DC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C152556ti F7f() {
        C152556ti c152556ti = this.A01;
        if (c152556ti == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c152556ti;
    }
}
