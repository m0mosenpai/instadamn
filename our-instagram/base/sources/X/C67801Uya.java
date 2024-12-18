package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.util.List;

/* renamed from: X.Uya, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67801Uya extends C3DB {
    public AdproObjectiveTypesEnum A00;
    public AdproRegulatedCategory A01;
    public BoostedActionStatus A02;
    public CallToActionType A03;
    public C66616UPd A04;
    public InstagramMediaProductType A05;
    public UPA A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T;

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C66616UPd c66616UPd = this.A04;
        if (c66616UPd == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        return c66616UPd;
    }
}
