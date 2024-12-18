package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.Njt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53404Njt extends Exception {
    public final BroadcastFailureType A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53404Njt(BroadcastFailureType broadcastFailureType, String str, String str2) {
        super(str2);
        C14360o3.A0B(str2, 3);
        this.A00 = broadcastFailureType;
        this.A01 = str;
    }
}
