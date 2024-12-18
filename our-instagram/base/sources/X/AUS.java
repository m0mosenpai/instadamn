package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AUS implements InterfaceC58362lv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CameraAREffect A01;
    public final /* synthetic */ C200558ty A02;
    public final /* synthetic */ A5F A03;

    public AUS(CameraAREffect cameraAREffect, C200558ty c200558ty, A5F a5f, int i) {
        this.A03 = a5f;
        this.A01 = cameraAREffect;
        this.A02 = c200558ty;
        this.A00 = i;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        JSONObject A00 = AbstractC226619zJ.A00((List) obj);
        this.A01.A0k = A00;
        C200558ty c200558ty = this.A02;
        if (this.A00 == c200558ty.A00) {
            c200558ty.A07.A00(A00);
        }
    }
}
