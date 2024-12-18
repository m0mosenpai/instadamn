package X;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.WiO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70858WiO implements InterfaceC190578cF {
    public final int A00;
    public final Object A01;

    public C70858WiO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJn() {
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DN8() {
    }

    @Override // X.InterfaceC190578cF
    public final void DSl(User user, int i) {
        UserSession userSession;
        C18920wW A01;
        String str;
        if (this.A00 != 0) {
            OJp oJp = (OJp) this.A01;
            C50939Mf8 c50939Mf8 = (C50939Mf8) oJp.A08.getValue();
            Editable text = oJp.A02.getText();
            C14360o3.A07(text);
            if (!user.A2D()) {
                AbstractC23641Du.A05(AnonymousClass191.A00, new PZY(user, c50939Mf8, null, 33), AbstractC141776au.A00(c50939Mf8));
                userSession = c50939Mf8.A02;
                A01 = AbstractC12220kQ.A01(c50939Mf8.A01, userSession);
                str = MSV.A00(505);
            } else {
                int[] iArr = AbstractC202818xz.A02;
                CharSequence A05 = AbstractC202818xz.A05(Selection.getSelectionEnd(text) - 1, text);
                String username = user.getUsername();
                if (A05 == null) {
                    return;
                }
                int length = text.length();
                Pattern pattern = AbstractC13670mt.A00;
                if ((length + username.length()) - A05.length() >= 200) {
                    return;
                }
                AbstractC23641Du.A05(AnonymousClass191.A00, new PZQ(user, c50939Mf8, username, null, 24), AbstractC141776au.A00(c50939Mf8));
                return;
            }
        } else {
            C70827Whk c70827Whk = (C70827Whk) this.A01;
            UFV A00 = C70827Whk.A00(c70827Whk);
            int selectionEnd = c70827Whk.A05.getSelectionEnd();
            if (!user.A2D()) {
                UFV.A02(new C68025V6t(user), A00);
                userSession = A00.A02.A01;
                A01 = AbstractC12220kQ.A01(null, userSession);
                str = "story";
            } else {
                UFV.A01(new SpannableStringBuilder(((UQN) A00.A07.getValue()).A01), A00, user, selectionEnd);
                return;
            }
        }
        FDR.A00(A01, userSession, user, str, "click", AbstractC111324zv.A00(67));
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJp(C217859kI c217859kI) {
    }
}
