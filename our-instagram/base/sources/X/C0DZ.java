package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.LinkedHashMap;

/* renamed from: X.0DZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DZ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DZ(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.14Y
            public final InterfaceC09390do A00;
            public final InterfaceC09390do A01;
            public final InterfaceC09390do A02;
            public final InterfaceC09390do A03;
            public final InterfaceC09390do A04;
            public final int A05;
            public final int A06;
            public final Context A07;
            public final boolean A08;

            {
                C14360o3.A0B(context, 1);
                this.A07 = context;
                EnumC09460dv enumC09460dv = EnumC09460dv.A02;
                this.A02 = AbstractC09440dt.A00(enumC09460dv, C14Z.A00);
                this.A08 = C20150ym.A07(AbstractC20100yh.A00(36323406009871566L));
                this.A01 = AbstractC09440dt.A00(enumC09460dv, C217414a.A00);
                this.A06 = (int) C20150ym.A01(AbstractC20100yh.A00(36604880986707088L));
                this.A05 = (int) C20150ym.A01(AbstractC20100yh.A00(36604880986969235L));
                this.A04 = AbstractC09440dt.A00(enumC09460dv, C217514b.A00);
                this.A03 = AbstractC09440dt.A00(enumC09460dv, C217614c.A00);
                this.A00 = AbstractC09440dt.A00(enumC09460dv, C217714d.A00);
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "PreinflateInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if (this.A08) {
                    C50802Vb.A05 = ((Boolean) this.A02.getValue()).booleanValue();
                    C13270mD.A06 = ((Boolean) this.A01.getValue()).booleanValue();
                    C50802Vb.A08 = ((Boolean) this.A04.getValue()).booleanValue();
                    C50802Vb.A07 = ((Boolean) this.A03.getValue()).booleanValue();
                    C50802Vb.A03 = ((Boolean) this.A00.getValue()).booleanValue();
                    int i = this.A06;
                    int i2 = this.A05;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Integer valueOf = Integer.valueOf(R.layout.row_feed_media_profile_header);
                    Integer num = C05F.A00;
                    linkedHashMap.put(valueOf, new C9BQ(num, i, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_media_media_group), new C9BQ(num, i, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_media_ufi_bar_bold), new C9BQ(num, i, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_carousel_media_group), new C9BQ(num, i, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.feed_full_height_media_frame_layout), new C9BQ(num, i, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_comment), new C9BQ(num, i2, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_view_all_comments), new C9BQ(num, i2, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_label_below_comments), new C9BQ(num, i2, 4));
                    linkedHashMap.put(Integer.valueOf(R.layout.row_feed_inline_composer_button), new C9BQ(num, i2, 4));
                    C50802Vb.A05(this.A07, new C50992Vv(0, 0, 0, false, 0, 1), linkedHashMap);
                }
            }
        };
    }
}
