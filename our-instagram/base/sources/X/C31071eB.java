package X;

import android.net.Uri;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.1eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31071eB extends AbstractC29011ae {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1eC
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31071eB c31071eB = (C31071eB) obj;
            anonymousClass182.A0d();
            c31071eB.A05();
            anonymousClass182.A0r("animated_media");
            AbstractC47867LCn.A00(anonymousClass182, c31071eB.A05());
            String str = c31071eB.A04;
            if (str != null) {
                anonymousClass182.A0S("pending_media_key", str);
            }
            if (c31071eB.A01 != null) {
                anonymousClass182.A0r("replied_to_message");
                AbstractC43642JSa.A01(anonymousClass182, c31071eB.A01);
            }
            if (c31071eB.A02 != null) {
                anonymousClass182.A0r("pending_media");
                AbstractC47865LCl.A00(anonymousClass182, c31071eB.A02);
            }
            if (c31071eB.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c31071eB.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c31071eB);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C31071eB parseFromJson = AbstractC46932KpD.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public DirectForwardingParams A00;
    public AnonymousClass442 A01;
    public C7Q4 A02;
    public DirectAnimatedMedia A03;
    public String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31071eB(DirectForwardingParams directForwardingParams, JTa jTa, C7Q4 c7q4, DirectThreadKey directThreadKey, Long l, float f, float f2, long j) {
        super(jTa, directThreadKey, l, j);
        C14360o3.A0B(c7q4, 3);
        String str = c7q4.A06;
        str.getClass();
        this.A04 = str;
        this.A02 = c7q4;
        String obj = new Uri.Builder().scheme("file").authority("").appendPath(c7q4.A02()).build().toString();
        C14360o3.A07(obj);
        this.A03 = new DirectAnimatedMedia(null, new GifUrlImpl(obj, f, f2), false, false, String.valueOf(System.nanoTime()), c7q4.A0A);
        this.A01 = null;
        this.A00 = directForwardingParams;
    }

    @Override // X.C1OW
    public final String A02() {
        return "config_animated_media_message";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A01;
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final DirectAnimatedMedia A05() {
        DirectAnimatedMedia directAnimatedMedia = this.A03;
        if (directAnimatedMedia != null) {
            return directAnimatedMedia;
        }
        C14360o3.A0F("animatedMedia");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0K;
    }

    public C31071eB() {
    }
}
