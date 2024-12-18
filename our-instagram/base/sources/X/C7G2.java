package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7G2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G2 implements InterfaceC160067Fs, InterfaceC160077Ft {
    public C8QJ A01;
    public boolean A03;
    public final UserSession A04;
    public final C7FM A05;
    public final C7FO A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A07 = C1XM.A00(new C206819Dm(this, 31));
    public C7G3 A00 = C7G3.A02;
    public InterfaceC16620sF A02 = C7G4.A00;

    public static final void A00(C7G3 c7g3, C7G2 c7g2) {
        C7G3 c7g32 = c7g2.A00;
        if (c7g32 != c7g3) {
            c7g2.A00 = c7g3;
            C09530e4 c09530e4 = new C09530e4(c7g32, c7g3);
            C7G3 c7g33 = C7G3.A04;
            C7G3 c7g34 = C7G3.A02;
            if (c09530e4.equals(new C09530e4(c7g33, c7g34))) {
                A01(c7g2, false);
                return;
            }
            C7G3 c7g35 = C7G3.A03;
            if (c09530e4.equals(new C09530e4(c7g35, c7g34))) {
                A01(c7g2, true);
                return;
            }
            if (c09530e4.equals(new C09530e4(c7g34, c7g35))) {
                c7g2.A02(true);
                return;
            }
            if (c09530e4.equals(new C09530e4(c7g33, c7g35))) {
                c7g2.A02(false);
                return;
            }
            if (!c09530e4.equals(new C09530e4(new Object(), c7g33))) {
                return;
            }
            A01(c7g2, false);
            C8QJ c8qj = c7g2.A01;
            if (c8qj == null || !c8qj.isShowing()) {
                return;
            }
            A01(c7g2, false);
            C8QJ c8qj2 = c7g2.A01;
            if (c8qj2 == null) {
                return;
            }
            c8qj2.dismiss();
        }
    }

    public static final void A01(C7G2 c7g2, boolean z) {
        View view = (View) c7g2.A07.getValue();
        if (view != null) {
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            if (z) {
                A01.A0G();
                A01.A0O(view.getRotation(), 0.0f);
                A01.A0H();
            } else {
                A01.A0G();
                view.setRotation(0.0f);
            }
        }
    }

    private final void A02(boolean z) {
        View contentView;
        View view = (View) this.A07.getValue();
        if (view != null) {
            C8QJ c8qj = this.A01;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            if (z) {
                A01.A0G();
                A01.A0O(view.getRotation(), 45.0f);
                A01.A0H();
            } else {
                A01.A0G();
                view.setRotation(45.0f);
            }
            if (c8qj != null && (contentView = c8qj.getContentView()) != null) {
                contentView.measure(0, 0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Resources resources = view.getResources();
                c8qj.showAtLocation(view, 0, (iArr[0] - contentView.getMeasuredWidth()) + view.getMeasuredWidth(), (iArr[1] - contentView.getMeasuredHeight()) - ((int) (resources.getDimension(R.dimen.abc_control_corner_material) * resources.getDisplayMetrics().density)));
                AbstractC125325le A012 = AbstractC125325le.A01(contentView, 1);
                A012.A0G();
                AbstractC125325le A0D = A012.A0C(450L).A0D(new OvershootInterpolator(1.7f));
                A0D.A0M(0.0f, 1.0f);
                A0D.A0U(0.0f, 0.95f, contentView.getMeasuredWidth());
                A0D.A0V(0.0f, 0.95f, contentView.getMeasuredHeight());
                A0D.A0S(35.0f, -5.0f);
                A0D.A05 = new C49598Lvr(contentView);
                A0D.A0H();
            }
        }
    }

    @Override // X.InterfaceC160077Ft
    public final ColorFilterAlphaImageView BaP() {
        return (ColorFilterAlphaImageView) this.A07.getValue();
    }

    @Override // X.InterfaceC160067Fs
    public final void FD4(boolean z) {
        View view = (View) this.A07.getValue();
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.A05.A00(C7GY.A07, C7GX.A0H, z);
    }

    public C7G2(View view, UserSession userSession, C7FM c7fm, C7FO c7fo) {
        this.A04 = userSession;
        this.A06 = c7fo;
        this.A05 = c7fm;
        this.A08 = C1XM.A00(new C9FA(29, this, view));
        A01(this, false);
        View view2 = (View) this.A07.getValue();
        if (view2 != null) {
            C0fQ.A00(new View.OnClickListener() { // from class: X.7G6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str;
                    C7G3 c7g3;
                    Context context;
                    int A05 = C0f9.A05(-1062714107);
                    C7G2 c7g2 = C7G2.this;
                    View view4 = (View) c7g2.A07.getValue();
                    if (view4 != null && (context = view4.getContext()) != null) {
                        C8QJ c8qj = (C8QJ) c7g2.A02.invoke(context, Boolean.valueOf(c7g2.A03));
                        c7g2.A01 = c8qj;
                        if (c8qj != null) {
                            c8qj.setFocusable(true);
                        }
                        C8QJ c8qj2 = c7g2.A01;
                        if (c8qj2 != null) {
                            c8qj2.setOutsideTouchable(true);
                        }
                        C8QJ c8qj3 = c7g2.A01;
                        if (c8qj3 != null) {
                            c8qj3.setOnDismissListener(new C23286ATx(c7g2));
                        }
                    }
                    int ordinal = c7g2.A00.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            C18920wW c18920wW = c7g2.A06.A00.A00;
                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_thread_dismiss_plus");
                            if (A00.isSampled()) {
                                A00.Cht();
                            }
                            c7g3 = C7G3.A02;
                        }
                        C0f9.A0C(-879003512, A05);
                    }
                    C7FO c7fo2 = c7g2.A06;
                    C7FM c7fm2 = c7g2.A05;
                    C7FR c7fr = c7fo2.A00;
                    java.util.Set entrySet = c7fm2.A00.entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : entrySet) {
                        Object value = ((Map.Entry) obj).getValue();
                        Object obj2 = linkedHashMap.get(value);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(value, obj2);
                        }
                        ((List) obj2).add(obj);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(((C7GY) entry.getKey()).A00, entry.getValue());
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        Iterable iterable = (Iterable) entry2.getValue();
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C7GX) ((Map.Entry) it.next()).getKey()).A00);
                        }
                        linkedHashMap3.put(key, arrayList);
                    }
                    String obj3 = new JSONObject(linkedHashMap3).toString();
                    C14360o3.A07(obj3);
                    InterfaceC16820sZ interfaceC16820sZ = c7fo2.A02;
                    C2ED c2ed = (C2ED) interfaceC16820sZ.invoke();
                    if (c2ed != null) {
                        str = c2ed.C7I();
                    } else {
                        str = null;
                    }
                    C18920wW c18920wW2 = c7fr.A00;
                    InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "direct_composer_thread_tap_plus");
                    if (A002.isSampled()) {
                        A002.AAP("extra_client_data", obj3);
                        if (str != null) {
                            A002.AAP("open_thread_id", str);
                        }
                        A002.Cht();
                    }
                    C2EC c2ec = (C2EC) interfaceC16820sZ.invoke();
                    if (c2ec != null) {
                        C7FQ c7fq = c7fo2.A01;
                        String C7I = c2ec.C7I();
                        String C7q = c2ec.C7q();
                        int C7g = c2ec.C7g();
                        int AdZ = c2ec.AdZ();
                        if (C7g != 28) {
                            if (C7g != 29) {
                                if (C7g != 61) {
                                    c7fq.A05.getValue();
                                }
                            } else {
                                C36288Fzi.A00((C36288Fzi) c7fq.A02.getValue(), Integer.valueOf(AdZ), C7I, C7q, "direct_composer_thread_tap_plus", "tap", "create_broadcast_chat_button", null);
                            }
                        }
                        C36293Fzn.A00(EnumC33514Ern.A09, EnumC33512Erl.THREAD_VIEW, (C36293Fzn) c7fq.A04.getValue(), "direct_composer_thread_tap_plus", "tap", null);
                    }
                    c7g3 = C7G3.A03;
                    C7G2.A00(c7g3, c7g2);
                    C0f9.A0C(-879003512, A05);
                }
            }, view2);
        }
    }

    @Override // X.InterfaceC160067Fs
    public final void ADk(InterfaceC16620sF interfaceC16620sF) {
        this.A02 = interfaceC16620sF;
    }
}
