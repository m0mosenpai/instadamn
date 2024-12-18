package X;

/* renamed from: X.3g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78993g5 {
    public static final C2WE A00(Object obj) {
        if (obj != null) {
            if (obj instanceof C2WE) {
                return (C2WE) obj;
            }
            throw new RuntimeException(AnonymousClass001.A0g("RenderTreeNode layout data for Litho should be LithoLayoutData but was <cls>", obj.getClass().getName(), "</cls>"));
        }
        throw new RuntimeException("layout data must not be null.");
    }

    public final C2WI A01(Object obj) {
        Object obj2 = A00(obj).A05;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof C2WI) {
            return (C2WI) obj2;
        }
        throw new RuntimeException(AnonymousClass001.A0g("Layout data was not InterStagePropsContainer but was <cls>", obj2.getClass().getName(), "</cls>"));
    }
}
