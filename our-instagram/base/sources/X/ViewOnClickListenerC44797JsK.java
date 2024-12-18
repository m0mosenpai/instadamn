package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.JsK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC44797JsK extends RecyclerView implements View.OnClickListener {
    public int A00;
    public C55105ObK A01;
    public InterfaceC58110PpZ A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC44797JsK(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        this.A00 = -1887089959;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A03 = of;
        AbstractC31174DnI.A17(context, this, false);
        setAdapter(new C44555Jnb(this, this));
        Resources resources = getResources();
        int A06 = AbstractC166997dE.A06(resources) + resources.getDimensionPixelSize(R.dimen.afi_margin_top);
        setClipToPadding(false);
        setPadding(A06, 0, A06, 0);
    }

    public void setBlurIconCache(C55105ObK c55105ObK) {
        C14360o3.A0B(c55105ObK, 0);
        this.A01 = c55105ObK;
    }

    public final void setEffectInfos(List list) {
        C14360o3.A0B(list, 0);
        this.A03 = list;
    }

    public void setEffects(List list, boolean z, UserSession userSession) {
        C14360o3.A0B(list, 0);
        this.A03 = list;
        this.A04 = z;
    }

    public void setFilterLogger(L64 l64) {
    }

    private final int A00(C44428Jkf c44428Jkf) {
        List list = this.A03;
        for (Object obj : list) {
            InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
            C14360o3.A07(interfaceC50490MQs);
            if (C14360o3.A0K(obj, interfaceC50490MQs)) {
                return list.indexOf(obj);
            }
        }
        throw new NoSuchElementException(MSV.A00(1));
    }

    public final void A1H(int i) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        View view = null;
        if (abstractC70663Fe != null && abstractC70663Fe.A0d(i) != null) {
            InterfaceC58110PpZ interfaceC58110PpZ = this.A02;
            if (interfaceC58110PpZ != null) {
                AbstractC70663Fe abstractC70663Fe2 = this.A0D;
                if (abstractC70663Fe2 != null) {
                    view = abstractC70663Fe2.A0d(i);
                }
                C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
                interfaceC58110PpZ.DtE((C44428Jkf) view, false);
                return;
            }
            return;
        }
        A14(new JoM(this, i));
        A0o(i);
    }

    public final List getEffectInfos() {
        return this.A03;
    }

    public List getTileFrames() {
        List A02 = AbstractC224517h.A02(new C011003y(this));
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame>");
        return A02;
    }

    public void setFilterListener(InterfaceC58110PpZ interfaceC58110PpZ) {
        this.A02 = interfaceC58110PpZ;
    }

    public final void setForcedDarkModeEnabled(boolean z) {
        this.A04 = z;
    }

    public void setRestoreSelectedIndex(int i) {
        post(new M3A(this, i));
    }

    public void setShouldUseBlurIcons(boolean z) {
        this.A05 = z;
    }

    public void setShowOverlayText(boolean z) {
        this.A06 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            r0 = -1954946985(0xffffffff8b79e057, float:-4.812443E-32)
            int r4 = X.C0f9.A05(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame"
            X.C14360o3.A0C(r6, r0)
            X.Jkf r6 = (X.C44428Jkf) r6
            r3 = 1
            int r2 = r6.getLeft()
            int r0 = r6.getWidth()
            int r2 = r2 - r0
            int r0 = r5.getPaddingLeft()
            int r2 = r2 + r0
            int r1 = r6.getRight()
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r5.getWidth()
            int r1 = r1 - r0
            int r0 = r5.getPaddingLeft()
            int r1 = r1 + r0
            if (r1 <= 0) goto L49
            int r0 = r5.A00(r6)
            int r0 = r0 + 1
        L38:
            r5.A0o(r0)
        L3b:
            X.PpZ r0 = r5.A02
            if (r0 == 0) goto L42
            r0.DtE(r6, r3)
        L42:
            r0 = 1548598923(0x5c4dbe8b, float:2.316475E17)
            X.C0f9.A0C(r0, r4)
            return
        L49:
            if (r2 >= 0) goto L3b
            int r0 = r5.A00(r6)
            if (r0 <= 0) goto L3b
            int r0 = r0 + (-1)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC44797JsK.onClick(android.view.View):void");
    }
}
