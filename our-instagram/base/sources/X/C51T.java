package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.51T, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C51T {
    public static final CameraTool A00(String str) {
        CameraTool cameraTool = (CameraTool) CameraTool.A01.get(str);
        if (cameraTool == null) {
            return CameraTool.A3E;
        }
        return cameraTool;
    }
}
