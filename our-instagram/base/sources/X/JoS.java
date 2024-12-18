package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JoS extends AbstractC55586OmP {
    public float A00;
    public float A01;
    public C3OO A02;
    public C47307KvI A03;
    public boolean A04;
    public float A05;
    public final Context A06;
    public final Jo9 A07;
    public final C7SS A08;
    public final List A09;
    public final List A0A = AbstractC166987dD.A1E();
    public final boolean A0B;
    public final float A0C;

    private final boolean A00(float f, float f2) {
        boolean A1P = AbstractC167007dF.A1P(AbstractC25230BEn.A1P((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) ? 1 : 0, this.A0B ? 1 : 0);
        if (!this.A04) {
            if (A1P) {
                float abs = Math.abs(f);
                if (abs <= Math.abs(f2) || abs <= ViewConfiguration.get(this.A06).getScaledTouchSlop()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != A1R) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    if (!A00(motionEvent.getX() - this.A00, motionEvent.getY() - this.A05)) {
                        return false;
                    }
                    this.A04 = A1R;
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(A1R);
                    return true;
                }
            }
            this.A04 = false;
            this.A0A.clear();
            this.A02 = null;
            recyclerView.getParent().requestDisallowInterceptTouchEvent(A1R);
            return false;
        }
        this.A00 = motionEvent.getX();
        this.A05 = motionEvent.getY();
        return false;
    }

    @Override // X.AbstractC55586OmP, X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
        C3OO c3oo;
        C47307KvI c47307KvI;
        C81543kP A0g;
        String str;
        View findViewWithTag;
        float max;
        C3OO c3oo2;
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != A1R) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else {
                if (!A00(motionEvent.getX() - this.A00, motionEvent.getY() - this.A05)) {
                    return;
                }
                this.A04 = A1R;
                recyclerView.getParent().requestDisallowInterceptTouchEvent(A1R);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.A02 == null) {
                    View A0T = recyclerView.A0T(x, y);
                    if (A0T != null) {
                        c3oo2 = recyclerView.A0Y(A0T);
                    } else {
                        c3oo2 = null;
                    }
                    this.A02 = c3oo2;
                }
                this.A01 = (motionEvent.getX() - this.A00) * 0.3f;
                for (Object obj : this.A09) {
                    C3OO c3oo3 = this.A02;
                    View view = null;
                    if (c3oo3 != null) {
                        view = c3oo3.itemView;
                    }
                    if ((view instanceof ViewGroup) && view != null && (findViewWithTag = view.findViewWithTag(obj)) != null) {
                        this.A0A.add(findViewWithTag);
                        boolean z = this.A0B;
                        float f = this.A01;
                        if (z) {
                            max = Math.min(0.0f, f);
                        } else {
                            max = Math.max(0.0f, f);
                        }
                        findViewWithTag.setTranslationX(max);
                    }
                }
                recyclerView.invalidate();
            }
        }
        if (Math.abs(this.A01) >= this.A0C && (c3oo = this.A02) != null && (c47307KvI = this.A03) != null) {
            int absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition();
            C26562BoL c26562BoL = c47307KvI.A00;
            MNC mnc = c26562BoL.A04;
            if (mnc instanceof C51834Mvc) {
                AbstractC166097bd abstractC166097bd = (AbstractC166097bd) AbstractC001800i.A0O(((C51834Mvc) mnc).A03, absoluteAdapterPosition);
                if (abstractC166097bd instanceof C167297di) {
                    Jn5 jn5 = c26562BoL.A03;
                    C167297di c167297di = (C167297di) abstractC166097bd;
                    String str2 = c167297di.A0K;
                    String str3 = c167297di.A0N;
                    C167297di A01 = AbstractC166327c1.A01(AbstractC25228BEl.A0s(jn5.A05), str2, str3);
                    if (A01 != null) {
                        Jn5.A00(A01, jn5);
                        LKh lKh = jn5.A08;
                        boolean A1W = AbstractC167007dF.A1W(str3);
                        C2EC A00 = LKh.A00(lKh);
                        if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
                            C09530e4 A02 = LKh.A02(lKh);
                            C09530e4 A03 = LKh.A03(lKh, A0g, A00);
                            if (A1W) {
                                str = "True";
                            } else {
                                str = "False";
                            }
                            AbstractC31172DnG.A0d(lKh.A04).A0W("comments_sheet_rendered", "tap", "reply_swipe_shortcut", "comments_view", A00.C7I(), A00.C7q(), AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str, A02, A03)), A00.AdZ());
                        }
                    }
                }
            }
        }
        List list = this.A0A;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC43592JPx.A09(it).setTranslationX(0.0f);
        }
        this.A04 = false;
        list.clear();
        this.A02 = null;
        recyclerView.getParent().requestDisallowInterceptTouchEvent(A1R);
        this.A01 = 0.0f;
        recyclerView.invalidate();
    }

    public JoS(Context context, List list) {
        this.A06 = context;
        this.A09 = list;
        this.A0B = AbstractC13620mo.A02(context);
        C7SS c7ss = new C7SS(context);
        this.A08 = c7ss;
        this.A0C = c7ss.A02 + c7ss.A03;
        this.A07 = new Jo9(this);
    }
}
