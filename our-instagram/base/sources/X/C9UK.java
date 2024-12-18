package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9UK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UK extends C2UU {
    public final C214979fZ A00;
    public final GradientDrawable A01;
    public final UserSession A02;
    public final HashMap A03;
    public final List A04;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        return new C9V1(context, this.A01, LayoutInflater.from(context).inflate(i, viewGroup, false), this.A02);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C9V1 c9v1 = (C9V1) c3oo;
        MemoryItem memoryItem = (MemoryItem) this.A04.get(i);
        HashMap hashMap = this.A03;
        AS1 as1 = new AS1(this, i, 0);
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    User user = memoryItem.A01.A02;
                    user.getClass();
                    IgImageView igImageView = c9v1.A0D;
                    igImageView.setImageDrawable(new C216169hZ(c9v1.A0A, c9v1.A0C, user));
                    igImageView.getLayoutParams().width = c9v1.A05;
                }
            } else {
                A98 a98 = memoryItem.A01;
                a98.getClass();
                C38321qM c38321qM = a98.A01;
                c38321qM.getClass();
                c9v1.A00 = c38321qM;
                Context context = c9v1.A0B.getContext();
                UserSession userSession = c9v1.A0C;
                int i2 = c9v1.A03;
                int i3 = c9v1.A02;
                C14360o3.A0B(context, 0);
                C194808jg A00 = AbstractC23122AKg.A00(context, null, userSession, null, c38321qM, c38321qM, null, "canvas_memories_bottom_sheet_fragment", i2, i3, 0, 0, false, false);
                if (A00.A08.size() > 1) {
                    A00.A0B(1);
                }
                IgImageView igImageView2 = c9v1.A0D;
                igImageView2.setImageDrawable(A00);
                igImageView2.getLayoutParams().width = c9v1.A04;
                igImageView2.getLayoutParams().height = c9v1.A01;
            }
        } else {
            A98 a982 = memoryItem.A01;
            a982.getClass();
            C38321qM c38321qM2 = a982.A01;
            c38321qM2.getClass();
            c9v1.A00 = c38321qM2;
            boolean containsKey = hashMap.containsKey(c38321qM2.getId());
            C38321qM c38321qM3 = c9v1.A00;
            if (containsKey) {
                Object obj = hashMap.get(c38321qM3.getId());
                obj.getClass();
                C9V1.A00((Medium) obj, c9v1);
            } else {
                Context context2 = c9v1.A0A;
                C121275eQ A03 = AbstractC50633MWu.A03(context2, c9v1.A0C, AbstractC50633MWu.A05(context2, c38321qM3, "CanvasMemoriesViewHolder", false, false));
                A03.A00 = new C215939h9(3, c9v1, c38321qM3, hashMap);
                C1GJ.A03(A03);
            }
        }
        IgImageView igImageView3 = c9v1.A0E;
        Context context3 = c9v1.A0A;
        UserSession userSession2 = c9v1.A0C;
        C202688xm c202688xm = new C202688xm(context3, userSession2, C217639jw.A01(context3, memoryItem), C217639jw.A00(context3, userSession2, memoryItem), c9v1.A06, c9v1.A08, c9v1.A09, c9v1.A07);
        C6RB c6rb = c202688xm.A01;
        AbstractC167017dG.A1N(context3, c6rb);
        AbstractC166987dD.A1U(EnumC15950qp.A12, AbstractC15960qq.A00(context3), c6rb);
        igImageView3.setImageDrawable(c202688xm);
        C0fQ.A00(as1, c9v1.A0B);
    }

    public C9UK(GradientDrawable gradientDrawable, UserSession userSession, C214979fZ c214979fZ, HashMap hashMap, List list) {
        AbstractC167017dG.A1Q(userSession, list);
        AbstractC167017dG.A1S(hashMap, gradientDrawable);
        this.A02 = userSession;
        this.A04 = list;
        this.A03 = hashMap;
        this.A01 = gradientDrawable;
        this.A00 = c214979fZ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(105660143);
        int size = this.A04.size();
        C0f9.A0A(-1455403682, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-1930171280, C0f9.A03(-1164331210));
        return R.layout.canvas_memories_item;
    }
}
