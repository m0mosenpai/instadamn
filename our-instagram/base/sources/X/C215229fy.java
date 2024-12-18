package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215229fy extends C2US {
    public C51756Mtf A00;
    public final C215259g1 A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.9g1, X.2y0] */
    public C215229fy(final InterfaceC168087f3 interfaceC168087f3, final InterfaceC11380iw interfaceC11380iw) {
        super(true);
        ?? r0 = new AbstractC65632xz(interfaceC168087f3, interfaceC11380iw) { // from class: X.9g1
            public final InterfaceC168087f3 A00;
            public final InterfaceC11380iw A01;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            {
                this.A01 = interfaceC11380iw;
                this.A00 = interfaceC168087f3;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj, Object obj2) {
                int A03 = C0f9.A03(-103944077);
                int A06 = AbstractC167007dF.A06(1, view, obj);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.comments.carousel.MentionThumnailViewBinder.Holder");
                C210789Ua c210789Ua = (C210789Ua) tag;
                C9ZB c9zb = (C9ZB) obj;
                InterfaceC11380iw interfaceC11380iw2 = this.A01;
                InterfaceC168087f3 interfaceC168087f32 = this.A00;
                AbstractC167017dG.A1N(c210789Ua, c9zb);
                C14360o3.A0B(interfaceC11380iw2, A06);
                IgImageView igImageView = c210789Ua.A00;
                igImageView.setUrl(new SimpleImageUrl(c9zb.A02), interfaceC11380iw2);
                ViewOnClickListenerC23248ASj.A00(igImageView, 3, interfaceC168087f32, c9zb);
                C0f9.A0A(1478753035, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-1904479004);
                C14360o3.A0B(viewGroup, 1);
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mention_thumbnail, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                inflate.setTag(new C210789Ua(inflate));
                C0f9.A0A(766437949, A03);
                return inflate;
            }
        };
        this.A01 = r0;
        init(r0);
    }
}
