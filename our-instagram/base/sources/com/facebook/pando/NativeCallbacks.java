package com.facebook.pando;

import X.AbstractC001800i;
import X.AbstractC40541uN;
import X.AnonymousClass001;
import X.C14360o3;
import X.C2JS;
import X.C48O;

/* loaded from: classes2.dex */
public final class NativeCallbacks {
    public final C48O innerCallbacks;

    public NativeCallbacks(C48O c48o) {
        C14360o3.A0B(c48o, 1);
        this.innerCallbacks = c48o;
    }

    public final void onError(PandoError pandoError) {
        C14360o3.A0B(pandoError, 0);
        this.innerCallbacks.DEA(pandoError);
    }

    public final void onModelUpdate(TreeJNI treeJNI, Summary summary) {
        C14360o3.A0B(treeJNI, 0);
        C14360o3.A0B(summary, 1);
        if (AbstractC40541uN.A00 && (treeJNI instanceof C2JS)) {
            C2JS c2js = (C2JS) treeJNI;
            if (!c2js.areAllSelectionsOptionalOrNonnull()) {
                String obj = treeJNI.getClass().toString();
                C14360o3.A07(obj);
                this.innerCallbacks.DEA(new PandoError(AnonymousClass001.A0R("A root field is required but null, or is required and has a recursively required but null child field:\n", AbstractC001800i.A0P("\n", "", "", c2js.bubbledNullPaths(obj), null)), "", "", (short) 0, "", "", "", "", false, false, false, ""));
                return;
            }
        }
        this.innerCallbacks.Dx2(summary, treeJNI);
    }
}
