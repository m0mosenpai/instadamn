package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202328xC extends C6RB implements InterfaceC25178BCb, InterfaceC133125ze, InterfaceC133135zf {
    public final User A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202328xC(Context context, User user, String str, int i) {
        super(context, i);
        C14360o3.A0B(str, 4);
        this.A00 = user;
        this.A01 = str;
    }

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C14360o3.A0B(enumC222529rt, 0);
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        Resources resources = this.A0Z.getResources();
        C14360o3.A07(resources);
        AMr.A09(resources, spannable, C1H4.A01(super.A00), enumC222529rt.A00(i), enumC222529rt.A01(i));
        A0R();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        Context context = this.A0Z;
        C14360o3.A07(context);
        C202328xC c202328xC = new C202328xC(context, this.A00, str, this.A07);
        TextPaint textPaint = this.A0b;
        c202328xC.A0I(textPaint.getTypeface());
        float textSize = textPaint.getTextSize();
        float f = super.A00;
        float f2 = super.A01;
        c202328xC.A09();
        c202328xC.A0A(textSize);
        c202328xC.A0C(f, f2);
        c202328xC.A0L(new SpannableString(this.A0F.toString()));
        return c202328xC;
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        if (this.A00 == null) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        List singletonList = Collections.singletonList(this.A00);
        C14360o3.A07(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : singletonList) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A01;
    }
}
