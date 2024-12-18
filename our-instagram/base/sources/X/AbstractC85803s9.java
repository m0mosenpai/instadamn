package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.3s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85803s9 {
    public final InterfaceC09390do A00;
    public final boolean A01;

    public final View A04(Context context, ViewGroup viewGroup) {
        View view;
        C14360o3.A0B(context, 0);
        InterfaceC16010qv interfaceC16010qv = (InterfaceC16010qv) this.A00.getValue();
        if (interfaceC16010qv != null) {
            List list = (List) ((C85813sA) interfaceC16010qv).A00.get(A02());
            if (list != null && (view = (View) AnonymousClass016.A15(list)) != null && (viewGroup instanceof RecyclerView)) {
                if (this.A01) {
                    int i = WFJ.A0A;
                    view.setTag(947501445, true);
                }
                A05(view);
                return view;
            }
        }
        View A03 = A03(context, viewGroup);
        A03.setTag(R.id.layout_id, Integer.valueOf(A02()));
        return A03;
    }

    public int A02() {
        if (this instanceof C85993sW) {
            return R.layout.row_feed_media_media_group;
        }
        if (this instanceof C85823sB) {
            return R.layout.row_feed_comment;
        }
        if (this instanceof C85833sC) {
            C85833sC c85833sC = (C85833sC) this;
            boolean z = c85833sC.A07;
            if (z && c85833sC.A04.A01()) {
                return R.layout.social_ufi_sandwich_dots_with_larger_cta_optimized_with_dots;
            }
            if (c85833sC.A04.A01()) {
                return R.layout.social_ufi_sandwich_dots_with_larger_cta_optimized;
            }
            if (!z) {
                return R.layout.row_feed_media_ufi_bar_bold;
            }
            return R.layout.row_feed_media_ufi_bar_bold_with_dots;
        }
        if (this instanceof C85843sD) {
            if (!C18U.A06(C06090Tz.A05, ((C85843sD) this).A00, 36327473339841119L)) {
                return R.layout.row_feed_view_all_comments;
            }
            return R.layout.row_feed_view_all_comments_viewstub;
        }
        if (this instanceof C85793s8) {
            return R.layout.row_feed_media_profile_header;
        }
        return R.layout.row_feed_media_feedback;
    }

    public View A03(Context context, ViewGroup viewGroup) {
        View inflate;
        Object c81323k2;
        int A03;
        int dimensionPixelSize;
        int i;
        View view;
        if (this instanceof C85993sW) {
            C85993sW c85993sW = (C85993sW) this;
            A03 = C0f9.A03(-1329065664);
            C14360o3.A0B(context, 0);
            LayoutInflater from = LayoutInflater.from(context);
            C14360o3.A07(from);
            View A00 = C50802Vb.A00(from, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_media_media_group, 0, false, true);
            C14360o3.A0B(A00, 1);
            C3W1 c3w1 = new C3W1(context, true);
            c3w1.addView(A00);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            c3w1.setLayoutParams(layoutParams);
            C81303k0 A06 = c85993sW.A06(c3w1, c85993sW.A03);
            c3w1.setTag(A06);
            A06.A01.A01();
            c3w1.addOnAttachStateChangeListener(new C9GO(c85993sW, A06));
            i = 851158396;
            view = c3w1;
        } else {
            if (this instanceof C85823sB) {
                C14360o3.A0B(context, 0);
                LayoutInflater from2 = LayoutInflater.from(context);
                C14360o3.A07(from2);
                inflate = C50802Vb.A00(from2, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_comment, 0, false, true);
                c81323k2 = new C87323uq(inflate);
            } else if (this instanceof C85833sC) {
                C85833sC c85833sC = (C85833sC) this;
                A03 = C0f9.A03(355288341);
                C14360o3.A0B(context, 0);
                int A02 = c85833sC.A02();
                LayoutInflater from3 = LayoutInflater.from(context);
                C14360o3.A07(from3);
                if (c85833sC.A04.A01()) {
                    dimensionPixelSize = -2;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
                }
                View A002 = C50802Vb.A00(from3, new ViewGroup.LayoutParams(-1, dimensionPixelSize), viewGroup, A02, 0, false, true);
                A002.setTag(new C81313k1(A002, c85833sC.A07));
                i = -757274411;
                view = A002;
            } else if (this instanceof C85843sD) {
                C85843sD c85843sD = (C85843sD) this;
                C14360o3.A0B(context, 0);
                int A022 = c85843sD.A02();
                LayoutInflater from4 = LayoutInflater.from(context);
                C14360o3.A07(from4);
                inflate = C50802Vb.A00(from4, new ViewGroup.LayoutParams(-1, -2), viewGroup, A022, 0, false, true);
                c81323k2 = new C4Cn(inflate, c85843sD.A01);
            } else if (this instanceof C85793s8) {
                C14360o3.A0B(context, 0);
                LayoutInflater from5 = LayoutInflater.from(context);
                C14360o3.A07(from5);
                inflate = C50802Vb.A00(from5, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_media_profile_header, 0, false, true);
                c81323k2 = AbstractC85893sI.A00(inflate);
            } else {
                C87023uI c87023uI = (C87023uI) this;
                C14360o3.A0B(context, 0);
                inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_media_feedback, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                String str = c87023uI.A03;
                c81323k2 = new C81323k2(inflate, c87023uI.A00, c87023uI.A01, c87023uI.A02, str);
            }
            inflate.setTag(c81323k2);
            return inflate;
        }
        C0f9.A0A(i, A03);
        return view;
    }

    public void A05(View view) {
        int dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams;
        Object c87323uq;
        if (this instanceof C85993sW) {
            C85993sW c85993sW = (C85993sW) this;
            C14360o3.A0B(view, 0);
            if (view.getTag() == null) {
                C81303k0 A06 = c85993sW.A06(view, c85993sW.A03);
                view.setTag(A06);
                A06.A01.A01();
                view.addOnAttachStateChangeListener(new C9GO(c85993sW, A06));
            } else {
                return;
            }
        } else {
            if (this instanceof C85793s8) {
                C14360o3.A0B(view, 0);
                if (view.getTag() != null) {
                    return;
                } else {
                    c87323uq = AbstractC85893sI.A00(view);
                }
            } else if (this instanceof C85843sD) {
                C85843sD c85843sD = (C85843sD) this;
                C14360o3.A0B(view, 0);
                if (view.getTag() != null) {
                    return;
                } else {
                    c87323uq = new C4Cn(view, c85843sD.A01);
                }
            } else if (this instanceof C85823sB) {
                C14360o3.A0B(view, 0);
                if (view.getTag() != null) {
                    return;
                } else {
                    c87323uq = new C87323uq(view);
                }
            } else {
                if (!(this instanceof C85833sC)) {
                    return;
                }
                C85833sC c85833sC = (C85833sC) this;
                C14360o3.A0B(view, 0);
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(new C81313k1(view, c85833sC.A07));
                Context context = view.getContext();
                C14360o3.A07(context);
                if (c85833sC.A04.A01()) {
                    dimensionPixelSize = -2;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
                }
                layoutParams = new ViewGroup.LayoutParams(-1, dimensionPixelSize);
                view.setLayoutParams(layoutParams);
            }
            view.setTag(c87323uq);
        }
        layoutParams = new ViewGroup.LayoutParams(-1, -2);
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.AbstractC65482xk.A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC85803s9(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            X.0dv r2 = X.EnumC09460dv.A03
            r1 = 0
            X.9Dn r0 = new X.9Dn
            r0.<init>(r4, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r3.A00 = r0
            boolean r0 = X.AbstractC65482xk.A00()
            if (r0 != 0) goto L1e
            boolean r1 = X.AbstractC65482xk.A01()
            r0 = 0
            if (r1 == 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC85803s9.<init>(android.content.Context):void");
    }
}
