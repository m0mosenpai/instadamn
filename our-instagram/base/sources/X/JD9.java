package X;

import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;

/* loaded from: classes7.dex */
public final class JD9 extends C0YY implements InterfaceC16660sJ {
    public static final JD9 A00 = new JD9();

    public JD9() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGStoryTextAlignmentTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return IGStoryTextAlignmentTypeEnum.A06;
        }
        return obj2;
    }
}
