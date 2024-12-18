package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.75z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576575z implements AnonymousClass760, AnonymousClass761 {
    public C189478aR A00;
    public Integer A01;
    public final Activity A02;
    public final UserSession A03;
    public final C7F3 A04;
    public final String A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;
    public final boolean A09;
    public final Context A0A;

    public C1576575z(Activity activity, Context context, UserSession userSession, C7F3 c7f3, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c7f3, 6);
        this.A0A = context;
        this.A02 = activity;
        this.A03 = userSession;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16660sJ;
        this.A04 = c7f3;
        this.A09 = z;
        this.A08 = z2;
        this.A05 = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    public final void A00(String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A03;
        L7V l7v = new L7V(this.A0A, userSession, this);
        ?? obj = new Object();
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.95f;
        c189448aO.A04 = 0.95f;
        c189448aO.A0U = new C49620LwD(this, obj);
        this.A00 = c189448aO.A00();
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36886398909022933L);
        int i = 0;
        l7v.A00(A04);
        boolean z2 = this.A09;
        boolean z3 = this.A08;
        String str2 = this.A05;
        Boolean valueOf = Boolean.valueOf(z);
        Integer num = this.A01;
        if (num != null) {
            i = num.intValue();
        }
        L1P l1p = new L1P(this, interfaceC16660sJ, obj);
        boolean booleanValue = valueOf.booleanValue();
        KBZ kbz = new KBZ();
        Bundle bundle = new Bundle();
        bundle.putString("arg_composer_input_string", str);
        bundle.putBoolean("arg_is_group", z2);
        bundle.putBoolean("arg_is_e2ee", z3);
        bundle.putString("arg_thread_id", str2);
        bundle.putBoolean("arg_entered_from_icon", booleanValue);
        bundle.putInt("arg_initial_keyboard_height", i);
        kbz.setArguments(bundle);
        kbz.A0C = l1p;
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A02(this.A02, kbz);
        }
    }

    @Override // X.AnonymousClass760
    public final void ERs(int i, int i2, int i3, int i4) {
    }

    @Override // X.AnonymousClass760
    public final void setBackgroundColor(int i) {
    }

    @Override // X.AnonymousClass761
    public final List D7x(ActionMode actionMode) {
        if (C18U.A06(C06090Tz.A05, this.A03, 36323448955677950L)) {
            long length = ((CharSequence) this.A06.invoke()).length();
            C7F3 c7f3 = this.A04;
            boolean z = this.A09;
            boolean z2 = this.A08;
            String str = this.A05;
            C25531Mh A0J = C25531Mh.A0J(c7f3.A01);
            EnumC72433Xdd A00 = C7F3.A00(z2, z);
            if (((AbstractC02600Aj) A0J).A00.isSampled()) {
                A0J.A0Z(24);
                A0J.A0R("selected_item", "write_with_ai_tooltip");
                A0J.A0X(1);
                A0J.A0Q("text_length", Long.valueOf(length));
                A0J.A0M(A00, "thread_type");
                A0J.A0O("is_e2ee", Boolean.valueOf(z2));
                A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A0J.Cht();
            }
            String string = this.A0A.getResources().getString(2131958921);
            C14360o3.A07(string);
            List singletonList = Collections.singletonList(new L00(string, new C50135MCj(this)));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    @Override // X.AnonymousClass760
    public final void EQQ(Drawable drawable) {
        Fragment fragment;
        C189478aR c189478aR;
        C189478aR c189478aR2 = this.A00;
        if (c189478aR2 != null && c189478aR2.A0S()) {
            C189478aR c189478aR3 = this.A00;
            if (c189478aR3 != null) {
                fragment = c189478aR3.A03.A0M();
            } else {
                fragment = null;
            }
            if ((fragment instanceof KBZ) && (c189478aR = this.A00) != null) {
                C50792Mc9 c50792Mc9 = new C50792Mc9(this.A0A);
                BottomSheetFragment bottomSheetFragment = c189478aR.A03;
                ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup != null) {
                    viewGroup.setClipToOutline(true);
                }
                ViewGroup viewGroup2 = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup2 != null) {
                    viewGroup2.setOutlineProvider(c50792Mc9);
                }
                if (bottomSheetFragment.isAdded() && bottomSheetFragment.mView != null) {
                    ViewGroup viewGroup3 = bottomSheetFragment.bottomSheetContainer;
                    if (viewGroup3 != null) {
                        viewGroup3.setBackground(drawable);
                        return;
                    }
                    return;
                }
                bottomSheetFragment.registerLifecycleListener(new C23619AdE(drawable, c189478aR));
            }
        }
    }
}
