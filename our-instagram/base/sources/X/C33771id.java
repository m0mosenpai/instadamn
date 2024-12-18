package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33771id extends AbstractC29011ae implements InterfaceC29501bR {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1ie
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33771id parseFromJson = AbstractC46947KpS.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33771id c33771id = (C33771id) obj;
            anonymousClass182.A0d();
            if (c33771id.A00 != null) {
                anonymousClass182.A0r("direct_voice_media");
                C4G1.A00(anonymousClass182, c33771id.A00);
            }
            c33771id.A07();
            anonymousClass182.A0r("note_reply");
            C44993Jvj A07 = c33771id.A07();
            anonymousClass182.A0d();
            String str = A07.A03;
            if (str != null) {
                anonymousClass182.A0S("note_igid", str);
            }
            String str2 = A07.A06;
            if (str2 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str2);
            }
            String str3 = A07.A05;
            if (str3 != null) {
                anonymousClass182.A0S("subtitle", str3);
            }
            ExtendedImageUrl extendedImageUrl = A07.A00;
            if (extendedImageUrl != null) {
                anonymousClass182.A0r("profile_pic_url");
                C17Y.A00(anonymousClass182, extendedImageUrl);
            }
            String str4 = A07.A01;
            if (str4 != null) {
                anonymousClass182.A0S("attachment_idx", str4);
            }
            String str5 = A07.A07;
            if (str5 != null) {
                anonymousClass182.A0S("waveform_data", str5);
            }
            String str6 = A07.A04;
            if (str6 != null) {
                anonymousClass182.A0S("sampling_frequency_hz", str6);
            }
            String str7 = A07.A02;
            if (str7 != null) {
                anonymousClass182.A0S("message_item_type", str7);
            }
            anonymousClass182.A0a();
            AbstractC47856LCb.A00(anonymousClass182, c33771id);
            anonymousClass182.A0a();
        }
    };
    public C4G2 A00 = new C4G2();
    public C44993Jvj A01;
    public ExtendedImageUrl A02;
    public String A03;

    @Override // X.C1OW
    public final String A02() {
        return "notes_send_audio_response";
    }

    public final C44993Jvj A07() {
        C44993Jvj c44993Jvj = this.A01;
        if (c44993Jvj != null) {
            return c44993Jvj;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29511bS
    public final /* bridge */ /* synthetic */ Object BSj() {
        return this.A00;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return C2EY.A1m;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0C(A07().A00, A07().A06, A07().A05));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0C(A07().A00, A07().A06, A07().A05));
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
