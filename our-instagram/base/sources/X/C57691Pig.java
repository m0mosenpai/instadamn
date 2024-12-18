package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;

/* renamed from: X.Pig, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57691Pig extends C0YY implements InterfaceC16660sJ {
    public static final C57691Pig A00 = new C57691Pig();

    public C57691Pig() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        ScreenShareApi screenShareApi = c52000Myq.A09.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(true, 0);
        }
        return C0eB.A00;
    }
}
