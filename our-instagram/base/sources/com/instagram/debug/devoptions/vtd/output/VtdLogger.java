package com.instagram.debug.devoptions.vtd.output;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC43594JPz;
import X.AnonymousClass001;
import X.C14360o3;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class VtdLogger {
    public final void logAttached(View view) {
        C14360o3.A0B(view, 0);
        logVTD(VtdIssueCategory.ATTACHED.getTag(), view);
    }

    public final void logHidden(View view) {
        C14360o3.A0B(view, 0);
        logVTD(VtdIssueCategory.VISIBILITY.getTag(), view);
    }

    private final String getId(View view) {
        String str = "";
        if (view.getId() == -1 || view.getId() == 0 || view.getId() == 1) {
            return "";
        }
        try {
            str = view.getResources().getResourceEntryName(view.getId());
        } catch (Resources.NotFoundException e) {
            Log.e("[VTD-ERROR]", AnonymousClass001.A0O("Failed to get resource entry name for id ", view.getId()), e);
        }
        return AbstractC25235BEs.A0r(" (", str);
    }

    private final String getParentHierarchy(View view) {
        ArrayList A1E = AbstractC166987dD.A1E();
        while ((view.getParent() instanceof View) && A1E.size() < 5) {
            view = AbstractC43594JPz.A0E(view);
            A1E.add(AnonymousClass001.A0R(AbstractC31173DnH.A0q(view), getId(view)));
        }
        return AbstractC31175DnJ.A0a(" -> ", AbstractC001800i.A0Y(A1E));
    }

    public final void logVTD(String str, View view) {
        AbstractC167017dG.A1N(str, view);
        getParentHierarchy(view);
        getId(view);
    }
}
