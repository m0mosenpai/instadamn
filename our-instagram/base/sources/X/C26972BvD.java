package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAssetImpl;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.BvD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26972BvD extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        String str;
        ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) view;
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            AbstractC25241Le.A02("IgShowreelNativeBinderUtils", "Attempt to render Bloks showreel native component outside a logged in user context.");
        } else if (c102884kP.A0G() != null && c102884kP.A0F() != null && c102884kP.A0L(38) != null) {
            LinkedList linkedList = new LinkedList();
            Iterator it = c102884kP.A0O(44).iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                C102884kP c102884kP2 = (C102884kP) it.next();
                Integer valueOf = Integer.valueOf(c102884kP2.A03(35, 0));
                String A0G = c102884kP2.A0G();
                if (A0G != null) {
                    str = A0G;
                }
                linkedList.add(new IgShowreelNativeAssetImpl(valueOf, Integer.valueOf(c102884kP2.A03(38, 0)), str));
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = new IgShowreelNativeAnimation(null, null, null, c102884kP.A0G(), c102884kP.A0L(38), c102884kP.A0F(), c102884kP.A0O(35), linkedList);
            C139366Sr c139366Sr = new C139366Sr(c102884kP.A0J(), c102884kP.A0H());
            if (c102884kP.A0S(45, false)) {
                ((AbstractC115825Lw) showreelNativeMediaView).A00 = Integer.MAX_VALUE;
                InterfaceC58682mR keyframesAnimatable = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                if (keyframesAnimatable != null) {
                    keyframesAnimatable.EH1();
                }
            } else {
                ((AbstractC115825Lw) showreelNativeMediaView).A00 = 1;
                InterfaceC58682mR keyframesAnimatable2 = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                if (keyframesAnimatable2 != null) {
                    keyframesAnimatable2.EH0(1);
                }
            }
            showreelNativeMediaView.E4S();
            C37416Gdw A00 = AbstractC37415Gdv.A00(igShowreelNativeAnimation);
            String A0L = c102884kP.A0L(48);
            if (A0L != null) {
                str = A0L;
            }
            showreelNativeMediaView.setShowreelAnimation(A00, A01, str, c139366Sr);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ((AbstractC115825Lw) view).stop();
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return new ShowreelNativeMediaView(context, new C9C9(AbstractC111324zv.A00(1272), "IG_FEED", 0), (C64Z) null, (C64X) null);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C26972BvD(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
