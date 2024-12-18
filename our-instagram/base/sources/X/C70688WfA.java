package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.WfA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70688WfA implements XCT {
    public final /* synthetic */ EnumC124565kK A00;
    public final /* synthetic */ MediaGenAIDetectionMethod A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.XCT
    public final void onFailure(Throwable th) {
    }

    public C70688WfA(EnumC124565kK enumC124565kK, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = enumC124565kK;
        this.A01 = mediaGenAIDetectionMethod;
    }

    @Override // X.XCT
    public final void onSuccess() {
        C124575kL.A00.A03(this.A00, this.A01, this.A02, null, this.A03, "genai_transparency_learn_more_impression", this.A04);
    }
}
