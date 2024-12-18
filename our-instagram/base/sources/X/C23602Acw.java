package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Acw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23602Acw implements C1NJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C23602Acw(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj5;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Number number;
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
            AbstractMap abstractMap = (AbstractMap) this.A01;
            C148286ly c148286ly = (C148286ly) this.A04;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
            Bitmap bitmap = c73033Pe.A01;
            if (bitmap != null) {
                Object C4x = interfaceC59502nt.C4x();
                if (C4x instanceof Integer) {
                    number = (Number) C4x;
                } else {
                    number = null;
                }
                int i = 0;
                abstractMap.put(Integer.valueOf(AbstractC167017dG.A0K(number)), bitmap);
                ImmutableList A02 = c148286ly.A02();
                if (A02 != null && abstractMap.size() == A02.size()) {
                    List A0a = AbstractC001800i.A0a(abstractMap.values());
                    Bitmap bitmap2 = (Bitmap) AbstractC001800i.A0J(A0a);
                    if (bitmap2 != null) {
                        int width = bitmap2.getWidth();
                        int height = bitmap2.getHeight();
                        Bitmap.Config config = bitmap2.getConfig();
                        C14360o3.A0A(config);
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                        C14360o3.A07(createBitmap);
                        Canvas canvas = new Canvas(createBitmap);
                        Iterator it = A0a.iterator();
                        while (it.hasNext()) {
                            canvas.drawBitmap((Bitmap) it.next(), 0.0f, 0.0f, (Paint) null);
                        }
                        ImmutableList A022 = c148286ly.A02();
                        if (A022 != null) {
                            i = A022.hashCode();
                        }
                        A0U.A00(createBitmap, interfaceC16820sZ, interfaceC16660sJ, i);
                        return;
                    }
                } else {
                    return;
                }
            }
            interfaceC16820sZ.invoke();
            return;
        }
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap3 = c73033Pe.A01;
        if (bitmap3 != null) {
            C1815883l c1815883l = (C1815883l) this.A03;
            Context context = (Context) this.A01;
            UserSession userSession = (UserSession) this.A05;
            User user = c1815883l.A00;
            String A0r = AbstractC166997dE.A0r(context.getResources(), AbstractC166987dD.A10(userSession).getUsername(), 2131974484);
            C14360o3.A07(A0r);
            C8FY c8fy = new C8FY(context.getResources(), bitmap3);
            c8fy.A02(AbstractC13880nE.A04(context, 12));
            C216259hi c216259hi = new C216259hi(context, c8fy, null, userSession, null, user, "", A0r);
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) ((TargetViewSizeProvider) this.A04)).A0K;
            C23108AGw A00 = A06.A00(0.56f, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), 0.7f, false);
            A00.A0R = true;
            ((InteractiveDrawableContainer) this.A02).A0J(c216259hi, new C8FC(A00), false, false, false);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        if (this.A00 != 0) {
            AbstractC166987dD.A1Y(this.A02);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
