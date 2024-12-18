package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.LinkedHashMap;
import java.util.TreeSet;

/* renamed from: X.Abh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23527Abh implements C2n2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23527Abh(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj3;
    }

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Drawable drawable;
        C2JS optionalTreeField;
        String optionalStringField;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj;
                InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) this.A01;
                C14360o3.A0A(number);
                int intValue = number.intValue();
                BEd A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer, intValue);
                if (A02 != null) {
                    drawable = ((C9LJ) A02).A0B;
                } else {
                    drawable = null;
                }
                C202278x7 A0L = interactiveDrawableContainer.A0L(intValue);
                if (drawable != null && A0L != null) {
                    if ((!(drawable instanceof C210499So) && !(drawable instanceof C210489Sn) && (AbstractC209069Mo.A04(drawable) || AbstractC209069Mo.A01(drawable) != null)) || AbstractC166997dE.A0G(drawable) <= 0 || AbstractC166997dE.A0H(drawable) <= 0) {
                        return null;
                    }
                    TreeSet treeSet = new TreeSet();
                    RectF A0H = AbstractC167007dF.A0H(drawable);
                    Matrix matrix = (Matrix) this.A03;
                    matrix.reset();
                    float f = A0L.A06;
                    matrix.preScale(f, f, A0L.A03, A0L.A04);
                    matrix.preTranslate(A0L.A01, A0L.A02);
                    matrix.mapRect(A0H);
                    treeSet.add(new C5NO(A0H, A0L.A05, intValue, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight()));
                    ((LinkedHashMap) this.A02).put(drawable, treeSet);
                    return null;
                }
                return null;
            case 1:
                C2JS c2js = (C2JS) obj;
                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "autofill_encrypted_credit_card(data:$input)", C213269cn.class, -2029332908)) != null && (optionalStringField = optionalTreeField.getOptionalStringField(0, "encrypted_card_number")) != null) {
                    C58444PvN c58444PvN = (C58444PvN) this.A02;
                    C2IE c2ie = (C2IE) this.A01;
                    SNN snn = (SNN) this.A03;
                    c58444PvN.A03(SSG.A00(c2ie.A01(optionalStringField)));
                    snn.A00();
                }
                return C0eB.A00;
            default:
                Throwable th = (Throwable) obj;
                ((C58444PvN) this.A01).A03(SSG.A01(th));
                ((SNN) this.A02).A00();
                return th;
        }
    }
}
