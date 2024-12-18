package X;

import java.io.IOException;

/* renamed from: X.Wgg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70767Wgg implements C1EH {
    public static final C70767Wgg A00 = new C70767Wgg();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        UQL uql = new UQL(null, null, null, null, null, 0, 0, 63, 2);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaStickerTimedInfo should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -993625031:
                        if (A0s.equals("tts_sfx")) {
                            uql.A02 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -952357052:
                        if (A0s.equals("tts_voice_name")) {
                            uql.A05 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -557632268:
                        if (A0s.equals("end_time_ms")) {
                            uql.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 537866993:
                        if (A0s.equals("tts_shortwave_id")) {
                            uql.A03 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1089510420:
                        if (A0s.equals("tts_voice_id")) {
                            uql.A04 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1106770299:
                        if (A0s.equals("start_time_ms")) {
                            uql.A01 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaStickerTimedInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return uql;
    }
}
