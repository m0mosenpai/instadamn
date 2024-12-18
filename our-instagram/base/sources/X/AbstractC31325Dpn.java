package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* renamed from: X.Dpn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31325Dpn {
    public static final int A00(Context context, int i, boolean z, boolean z2) {
        if (!z || !z2 || i <= 0) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        String string = context.getString(2131959341, C84963qk.A03(resources, valueOf));
        C14360o3.A07(string);
        return JVK.A01(context, string) + (context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static final ImmutableList A01(ImmutableList immutableList, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        PriorityQueue priorityQueue = new PriorityQueue(i, new C31460Ds4((InterfaceC16620sF) GWL.A00, 6));
        C1LC it = immutableList.iterator();
        C14360o3.A07(it);
        DirectCountBasedReaction directCountBasedReaction = null;
        while (it.hasNext()) {
            DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) it.next();
            if (directCountBasedReaction2.A00 > 0) {
                if (directCountBasedReaction2.A02) {
                    directCountBasedReaction = directCountBasedReaction2;
                }
                if (priorityQueue.size() == i) {
                    DirectCountBasedReaction directCountBasedReaction3 = (DirectCountBasedReaction) priorityQueue.peek();
                    if (directCountBasedReaction3 != null && directCountBasedReaction2.A00 > directCountBasedReaction3.A00) {
                        priorityQueue.poll();
                    }
                }
                priorityQueue.add(directCountBasedReaction2);
            }
        }
        while (!priorityQueue.isEmpty()) {
            DirectCountBasedReaction directCountBasedReaction4 = (DirectCountBasedReaction) priorityQueue.poll();
            if (directCountBasedReaction4 != null && directCountBasedReaction4.A01.length() > 0) {
                A1E.add(directCountBasedReaction4);
            }
        }
        if (directCountBasedReaction != null && !A1E.contains(directCountBasedReaction)) {
            A1E.set(0, directCountBasedReaction);
        }
        return AbstractC31173DnH.A0L(AbstractC001800i.A0Y(A1E));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        if (r41.isEmpty() != false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.7DA, X.7AS] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.7DA, X.7AS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7DA A02(android.content.res.Resources r40, com.google.common.collect.ImmutableList r41, com.instagram.common.session.UserSession r42, X.AnonymousClass988 r43, X.C7IH r44, X.C2EY r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31325Dpn.A02(android.content.res.Resources, com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, X.988, X.7IH, X.2EY, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):X.7DA");
    }
}
