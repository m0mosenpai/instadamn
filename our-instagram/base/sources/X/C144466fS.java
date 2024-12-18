package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144466fS {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;
    public InterfaceC41501vz A02;
    public InterfaceC41501vz A03;
    public boolean A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final UserSession A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC09390do A0A;
    public final View A0B;

    public C144466fS(View view, ViewGroup viewGroup, ViewGroup viewGroup2, ViewStub viewStub, ViewStub viewStub2, UserSession userSession) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(viewGroup2, 3);
        C14360o3.A0B(viewStub, 4);
        C14360o3.A0B(viewStub2, 5);
        this.A0B = view;
        this.A06 = viewGroup;
        this.A05 = viewGroup2;
        this.A07 = userSession;
        this.A09 = AbstractC56372iV.A01(viewStub, false, false);
        this.A08 = AbstractC56372iV.A01(viewStub2, false, false);
        this.A0A = C1XM.A00(new C9E9(this, 4));
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(3);
    }

    public final void A02() {
        this.A04 = false;
        this.A0B.setVisibility(0);
        this.A09.setVisibility(8);
        this.A08.setVisibility(8);
        A00();
    }

    public final void A03(C41181vS c41181vS, InterfaceC144776fx interfaceC144776fx, String str) {
        this.A04 = false;
        A00();
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        A00.A0t = str;
        A00.A0f = 1;
        C84923qg c84923qg = new C84923qg(A00.A00());
        c84923qg.A06 = EnumC84933qh.A09;
        c84923qg.A01(c41181vS.A0b);
        this.A01 = new C70725Wfq(c84923qg, c41181vS, interfaceC144776fx, this);
        this.A00 = new C70726Wfr(c84923qg, c41181vS, interfaceC144776fx, this);
        this.A03 = new LYT(c41181vS, interfaceC144776fx, this);
        this.A02 = new LYU(c41181vS, interfaceC144776fx, this);
        C25671My A002 = AbstractC25651Mw.A00(this.A07);
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            A002.A01(interfaceC41501vz, C72233Lw.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A00;
            if (interfaceC41501vz2 != null) {
                A002.A01(interfaceC41501vz2, C72243Lx.class);
                InterfaceC41501vz interfaceC41501vz3 = this.A03;
                if (interfaceC41501vz3 != null) {
                    A002.A01(interfaceC41501vz3, C72393Mm.class);
                    InterfaceC41501vz interfaceC41501vz4 = this.A02;
                    if (interfaceC41501vz4 != null) {
                        A002.A01(interfaceC41501vz4, C72413Mo.class);
                        A01(c84923qg, c41181vS, this);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00() {
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz, C72233Lw.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A00;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz2, C72243Lx.class);
        }
        InterfaceC41501vz interfaceC41501vz3 = this.A03;
        if (interfaceC41501vz3 != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz3, C72393Mm.class);
        }
        InterfaceC41501vz interfaceC41501vz4 = this.A02;
        if (interfaceC41501vz4 != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz4, C72413Mo.class);
        }
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static final void A01(C84923qg c84923qg, C41181vS c41181vS, C144466fS c144466fS) {
        String str;
        InterfaceC09390do interfaceC09390do = c144466fS.A0A;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        Context context = ((View) value).getContext();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        C14360o3.A0A(context);
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        int color2 = context.getColor(R.color.debug_overlay_white_70_transparent);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        TextPaint textPaint = new TextPaint(1);
        textPaint.linkColor = color2;
        textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(color);
        C57482kN c57482kN = new C57482kN(alignment, textPaint, null, 0.0f, 1.0f, context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2), false);
        C57352kA A05 = C57352kA.A05(c144466fS.A07);
        C14360o3.A07(A05);
        boolean z = c144466fS.A04;
        AnonymousClass341 anonymousClass341 = AnonymousClass341.A0Y;
        Integer valueOf = Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background));
        Integer valueOf2 = Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background));
        List BlY = c41181vS.BlY(EnumC75383a5.A0n);
        ArrayList arrayList = null;
        if (BlY != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(BlY, 10));
            Iterator it = BlY.iterator();
            while (it.hasNext()) {
                User user = ((C84823qW) it.next()).A1C;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
        }
        C85163r7 c85163r7 = new C85163r7(c57482kN, c84923qg, null, anonymousClass341, null, null, valueOf2, valueOf, 1, arrayList, z, false, false, false, false, z, false, true, true, true, false, false, false, false);
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        ((TextView) value2).setText(AbstractC85153r6.A00(context, A05, c85163r7, new SearchContext(null, null, null, null, null, null, null, null), true));
        Object value3 = interfaceC09390do.getValue();
        C14360o3.A07(value3);
        ((TextView) value3).setMovementMethod(LinkMovementMethod.getInstance());
        Object value4 = interfaceC09390do.getValue();
        C14360o3.A07(value4);
        ((TextView) value4).setHighlightColor(context.getColor(R.color.fds_transparent));
        Object value5 = interfaceC09390do.getValue();
        C14360o3.A07(value5);
        ((TextView) value5).setSingleLine(!c144466fS.A04);
        c144466fS.A0B.setVisibility(8);
        c144466fS.A09.setVisibility(0);
        c144466fS.A08.setVisibility(0);
    }
}
