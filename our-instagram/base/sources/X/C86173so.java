package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86173so implements C33R {
    public long A00;
    public long A01;
    public View.OnClickListener A02;
    public View A03;
    public IgLinearLayout A04;
    public EnumC79653hG A05;
    public SlideInAndOutIconView A06;
    public InterfaceC16820sZ A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final View A0E;

    public C86173so(Context context, View view, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        C14360o3.A0B(viewStub, 1);
        C14360o3.A0B(viewStub2, 2);
        C14360o3.A0B(viewStub3, 3);
        this.A0D = viewStub;
        this.A0B = viewStub2;
        this.A0C = viewStub3;
        this.A0A = context;
        this.A0E = view;
        this.A05 = EnumC79653hG.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        r2 = "button";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0095, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009c, code lost:
    
        if (r0 == null) goto L60;
     */
    @Override // X.C33R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSJ(X.C75113Zb r9, int r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86173so.DSJ(X.3Zb, int):void");
    }

    private final void A01(View view) {
        if (this.A09) {
            C14360o3.A0A(view.animate().alpha(0.0f).setDuration(400L).setListener(new U7r(view)));
        } else {
            view.setVisibility(8);
        }
    }

    private final void A02(View view) {
        if (this.A09) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            C14360o3.A0A(view.animate().alpha(1.0f).setDuration(400L).setListener(new C66294U7s(view, this)));
            return;
        }
        view.setVisibility(0);
    }

    public static final void A03(View view, C86173so c86173so) {
        if (!c86173so.A08) {
            Rect rect = new Rect();
            if (view.isShown() && view.getLocalVisibleRect(rect)) {
                InterfaceC16820sZ interfaceC16820sZ = c86173so.A07;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    c86173so.A08 = true;
                } else {
                    C14360o3.A0F("impression");
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    private final void A04(SlideInAndOutIconView slideInAndOutIconView, String str) {
        Context context = this.A0A;
        slideInAndOutIconView.setIcon(context.getDrawable(R.drawable.instagram_expand_pano_outline_24));
        if (str != null) {
            slideInAndOutIconView.setText(str);
            slideInAndOutIconView.setTextCapitalization(false);
        }
        TitleTextView titleTextView = slideInAndOutIconView.A0C;
        int lineHeight = titleTextView.getLineHeight() + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(context.getDrawable(R.drawable.instagram_expand_pano_outline_24), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        slideInAndOutIconView.setIconColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media)));
        slideInAndOutIconView.setIconScale(0.5f);
    }

    public static final View A00(ViewStub viewStub, C86173so c86173so) {
        View requireViewById;
        if (viewStub.getParent() != null) {
            requireViewById = viewStub.inflate();
        } else {
            requireViewById = c86173so.A0E.requireViewById(viewStub.getInflatedId());
        }
        C14360o3.A07(requireViewById);
        return requireViewById;
    }
}
