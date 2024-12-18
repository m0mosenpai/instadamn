package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.UyZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67800UyZ extends C3DB {
    public C51756Mtf A00;
    public C32054E6g A01;
    public User A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Double A06;
    public Double A07;
    public Double A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0G;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C32054E6g c32054E6g = this.A01;
        if (c32054E6g == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c32054E6g;
    }
}
