package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.KMt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45741KMt extends AbstractC56237Oxk {
    @Override // X.InterfaceC50490MQs
    public final AbstractC44335Jia AWq(Context context, Drawable drawable, EnumC46217Kct enumC46217Kct) {
        Drawable drawable2;
        Integer num;
        Resources resources = context.getResources();
        if (!enumC46217Kct.equals(EnumC46217Kct.A08) && !enumC46217Kct.equals(EnumC46217Kct.A09)) {
            boolean equals = enumC46217Kct.equals(EnumC46217Kct.A06);
            drawable2 = context.getDrawable(this.A00);
            if (equals) {
                num = C05F.A00;
            } else {
                return new C45742KMv(resources, drawable2);
            }
        } else {
            drawable2 = context.getDrawable(this.A00);
            num = C05F.A01;
        }
        return new C45743KMw(resources, drawable2, num);
    }
}
