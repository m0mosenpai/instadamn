package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.reels.memories.model.MemoryItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218059kd extends ACt {
    public int A00;
    public Drawable A01;
    public View A02;
    public C202728xq A03;
    public C202668xk A04;
    public C38321qM A05;
    public final Context A07;
    public final UserSession A08;
    public final TargetViewSizeProvider A09;
    public final C88Y A0A;
    public final C23108AGw A0B;
    public final HashMap A0C = AbstractC166987dD.A1G();
    public final C8FC A0D = new C8FC((C8D0) new C183748Cz(0.5f, 0.15f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false);
    public List A06 = Collections.emptyList();

    public C218059kd(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        this.A0A = c88y;
        this.A07 = context;
        this.A08 = userSession;
        this.A02 = view;
        this.A09 = targetViewSizeProvider;
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0F = false;
        c23108AGw.A04 = 0.7f;
        c23108AGw.A01(0.0f, AbstractC166987dD.A04(context.getResources(), R.dimen.account_group_management_clickable_width));
        c23108AGw.A0R = false;
        this.A0B = c23108AGw;
        this.A02 = view;
    }

    public static void A00(C5GJ c5gj, C218059kd c218059kd) {
        MemoryItem memoryItem = (MemoryItem) c218059kd.A06.get(c218059kd.A00);
        int ordinal = memoryItem.A00.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c218059kd.A05 = null;
                    C88Y c88y = c218059kd.A0A;
                    c88y.A0F(null);
                    c88y.A0A(new C202678xl(c218059kd.A07, c218059kd.A08, memoryItem), c5gj, C148276lx.A18);
                }
            } else {
                A98 a98 = memoryItem.A01;
                a98.getClass();
                c218059kd.A05 = a98.A01;
                C88Y c88y2 = c218059kd.A0A;
                c88y2.A0F(null);
                C38321qM c38321qM = c218059kd.A05;
                C88E c88e = c88y2.A00;
                c88e.A01.A00();
                c88e.A01.A03.A0Q(c5gj, c38321qM, null);
                c88y2.A0C(new C217639jw(c218059kd.A07, c218059kd.A08, memoryItem, InterfaceC1812882f.A00(c218059kd.A09)), c218059kd.A0D, false);
            }
        } else {
            A98 a982 = memoryItem.A01;
            a982.getClass();
            c218059kd.A05 = a982.A01;
            C88Y c88y3 = c218059kd.A0A;
            Context context = c218059kd.A07;
            UserSession userSession = c218059kd.A08;
            c88y3.A0C(new C217639jw(context, userSession, memoryItem, InterfaceC1812882f.A00(c218059kd.A09)), c218059kd.A0D, true);
            C38321qM c38321qM2 = c218059kd.A05;
            c38321qM2.getClass();
            if (c218059kd.A0C.containsKey(c38321qM2.getId())) {
                A01(c5gj, c218059kd, c38321qM2);
            } else {
                C121275eQ A03 = AbstractC50633MWu.A03(context, userSession, AbstractC50633MWu.A05(context, c38321qM2, "CanvasMemoriesController", false, false));
                A03.A00 = new C215939h9(2, c218059kd, c38321qM2, c5gj);
                C1GJ.A03(A03);
            }
        }
        C8TS c8ts = c218059kd.A0A.A00.A01;
        c8ts.A08.A0r(new C23525Abf(c8ts, z));
    }

    public static void A01(C5GJ c5gj, C218059kd c218059kd, C38321qM c38321qM) {
        if (c218059kd.A0A.A0L(c218059kd) && c38321qM == c218059kd.A05) {
            Object obj = c218059kd.A0C.get(c38321qM.getId());
            obj.getClass();
            Medium medium = (Medium) obj;
            Context context = c218059kd.A07;
            C38321qM c38321qM2 = c218059kd.A05;
            c38321qM2.getClass();
            ExtendedImageUrl A1q = c38321qM2.A1q(context);
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c218059kd.A09).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            C8OK c8ok = C8OK.A0A;
            AbstractC167007dF.A1D(context, 1, medium);
            C202728xq c202728xq = new C202728xq(context, null, medium, A1q, c8ok, null, width, height, false, true, false, false);
            c218059kd.A03 = c202728xq;
            c202728xq.A9I(new C23673Ae8(0, c218059kd, c5gj, medium));
        }
    }

    public static boolean A02(C218059kd c218059kd) {
        C38321qM c38321qM = c218059kd.A05;
        if (c38321qM != null && c38321qM.A63() && c218059kd.A0C.containsKey(c218059kd.A05.getId())) {
            return true;
        }
        return false;
    }
}
