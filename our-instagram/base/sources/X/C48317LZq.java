package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;

/* renamed from: X.LZq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48317LZq implements InterfaceC66482zP {
    public final TrackOrOriginalSoundSchema A00;
    public final InterfaceC11380iw A01;

    public C48317LZq(TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(trackOrOriginalSoundSchema, 1);
        this.A00 = trackOrOriginalSoundSchema;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC66482zP
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String getKey() {
        TrackData trackData;
        String audioAssetId;
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = this.A00;
        OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
        if ((originalSoundData != null && (audioAssetId = originalSoundData.A0I) != null) || ((trackData = trackOrOriginalSoundSchema.A01) != null && (audioAssetId = trackData.getAudioAssetId()) != null)) {
            return audioAssetId;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema;
        C48317LZq c48317LZq = (C48317LZq) obj;
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema2 = this.A00;
        if (c48317LZq != null) {
            trackOrOriginalSoundSchema = c48317LZq.A00;
        } else {
            trackOrOriginalSoundSchema = null;
        }
        return C14360o3.A0K(trackOrOriginalSoundSchema2, trackOrOriginalSoundSchema);
    }
}
