package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.39u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C693439u {
    public static String A02 = "v1";
    public static final C693539v A03 = new Object();
    public final InterfaceC692739n A00;
    public final boolean A01;

    public C693439u(InterfaceC692739n interfaceC692739n) {
        C14360o3.A0B(interfaceC692739n, 1);
        this.A00 = interfaceC692739n;
        this.A01 = false;
    }

    public final void A00(View view, C51757Mtg c51757Mtg, UserSession userSession, InterfaceC38381qS interfaceC38381qS, Object obj) {
        Throwable illegalStateException;
        int i;
        int i2;
        C38321qM c38321qM;
        int A032 = C0f9.A03(-2022732367);
        C14360o3.A0B(userSession, 0);
        view.setTag(R.id.row_tombstone_item, interfaceC38381qS);
        C38525Gwl c38525Gwl = (C38525Gwl) view.getTag();
        if (c38525Gwl != null) {
            C693539v c693539v = A03;
            View view2 = c38525Gwl.A06;
            view2.setOnClickListener(null);
            view2.setVisibility(8);
            IQZ.A00(c38525Gwl);
            TextView textView = c38525Gwl.A0H;
            textView.setVisibility(8);
            c38525Gwl.itemView.setVisibility(0);
            if (interfaceC38381qS instanceof C42525Is4) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                C75113Zb c75113Zb = (C75113Zb) obj;
                C693539v.A08(c38525Gwl, false);
                textView.setText(2131975662);
                if (c75113Zb.A0m != EnumC75193Zm.A03) {
                    c38525Gwl.A00();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(EnumC39547HdJ.A05, 2131975651);
                    linkedHashMap.put(EnumC39547HdJ.A06, 2131975672);
                    linkedHashMap.put(EnumC39547HdJ.A02, 2131975673);
                    ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
                    c38525Gwl.A02(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int indexOf = arrayList.indexOf(next);
                        ArrayList arrayList2 = c38525Gwl.A0J;
                        View requireViewById = ((View) arrayList2.get(indexOf)).requireViewById(R.id.survey_tombstone_reason_text);
                        C14360o3.A07(requireViewById);
                        TextView textView2 = (TextView) requireViewById;
                        Object obj2 = linkedHashMap.get(next);
                        if (obj2 != null) {
                            textView2.setText(((Number) obj2).intValue());
                            C0fQ.A00(new ViewOnClickListenerC41901Ihu(c38525Gwl, c75113Zb), (View) arrayList2.get(indexOf));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C693539v.A07(c38525Gwl, 8);
                }
                c38525Gwl.A01();
            } else if (c51757Mtg != null && (c38321qM = (C38321qM) c51757Mtg.A01) != null) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                C75113Zb c75113Zb2 = (C75113Zb) obj;
                C75113Zb c75113Zb3 = c38525Gwl.A03;
                if (c75113Zb3 != null && c75113Zb3 != c75113Zb2) {
                    c75113Zb3.A0M(c38525Gwl, null, false);
                }
                c38525Gwl.A01 = c38321qM;
                c38525Gwl.A03 = c75113Zb2;
                c38525Gwl.A02 = this.A00;
                c38525Gwl.A04 = this.A01;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Object systemService = view.getContext().getSystemService("window");
                if (systemService != null) {
                    ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                    if (c38525Gwl.A04) {
                        View view3 = c38525Gwl.A07;
                        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        view3.setLayoutParams(layoutParams);
                        View view4 = c38525Gwl.A0B;
                        ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        view4.setLayoutParams(layoutParams2);
                        c38525Gwl.A0D.setPadding(0, (int) (displayMetrics.heightPixels * 0.27d), 0, 0);
                        c38525Gwl.A0E.setPadding(0, 0, 0, (int) (displayMetrics.heightPixels * 0.27d));
                    }
                    int i3 = c38525Gwl.A05;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            C693539v.A08(c38525Gwl, true);
                            TextView textView3 = c38525Gwl.A0F;
                            Context context = textView3.getContext();
                            JFW jfw = (JFW) ((C37995Gng) c51757Mtg.A00).A06;
                            if (!(jfw instanceof C42642Itz)) {
                                if (jfw instanceof C42641Ity) {
                                    C42641Ity c42641Ity = (C42641Ity) jfw;
                                    String string = context.getString(c42641Ity.A01);
                                    String string2 = context.getString(c42641Ity.A00);
                                    c38525Gwl.A08.setVisibility(8);
                                    c38525Gwl.A0B.setVisibility(0);
                                    c38525Gwl.A0D.setVisibility(8);
                                    Resources resources = context.getResources();
                                    textView3.setText(string);
                                    AbstractC13880nE.A0d(textView3, resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) + textView3.getPaint().getFontMetricsInt().top);
                                    TextView textView4 = c38525Gwl.A0E;
                                    textView4.setText(string2);
                                    AbstractC13880nE.A0Y(textView4, resources.getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height) - textView4.getPaint().getFontMetricsInt().bottom);
                                } else if (jfw instanceof C42640Itx) {
                                    c38525Gwl.A00();
                                    List list = ((C42640Itx) jfw).A00;
                                    c38525Gwl.A02(list.size());
                                    int size = list.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ArrayList arrayList3 = c38525Gwl.A0J;
                                        View requireViewById2 = ((View) arrayList3.get(i4)).requireViewById(R.id.survey_tombstone_reason_text);
                                        C14360o3.A07(requireViewById2);
                                        ((TextView) requireViewById2).setText((CharSequence) list.get(i4));
                                        C0fQ.A00(new ViewOnClickListenerC41967Iiy(c51757Mtg, c38525Gwl, jfw, i4), (View) arrayList3.get(i4));
                                    }
                                    C693539v.A07(c38525Gwl, 8);
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            c38525Gwl.A01();
                        } else {
                            illegalStateException = new UnsupportedOperationException("Unsupported tombstone type");
                            i = 289373657;
                        }
                    } else {
                        c693539v.A09(c51757Mtg, userSession, c38525Gwl, c75113Zb2);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (interfaceC38381qS instanceof C42520Irz) {
                C42520Irz c42520Irz = (C42520Irz) interfaceC38381qS;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedSurveyState");
                C42666IuN c42666IuN = (C42666IuN) obj;
                C693539v.A08(c38525Gwl, false);
                if (c42666IuN.A01 != C05F.A00) {
                    c38525Gwl.A00();
                    List list2 = c42520Irz.A01.A0A;
                    if (list2 == null) {
                        list2 = C16930sl.A00;
                    }
                    c38525Gwl.A02(list2.size());
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ArrayList arrayList4 = c38525Gwl.A0J;
                        View requireViewById3 = ((View) arrayList4.get(i5)).requireViewById(R.id.survey_tombstone_reason_text);
                        C14360o3.A07(requireViewById3);
                        ((TextView) requireViewById3).setText(((InterfaceC39331sE) list2.get(i5)).getText());
                        C0fQ.A00(new ViewOnClickListenerC41985IjG(c42520Irz, this, c38525Gwl, c42666IuN, i5), (View) arrayList4.get(i5));
                    }
                    C693539v.A07(c38525Gwl, 8);
                }
                c38525Gwl.A01();
            } else if (interfaceC38381qS instanceof C105854pw) {
                int i6 = c38525Gwl.A05;
                C693539v.A07(c38525Gwl, 8);
                IQZ.A01(c38525Gwl, 8);
                TextView textView5 = c38525Gwl.A0F;
                if (i6 == 3) {
                    textView5.setText(2131975661);
                    textView5.getPaint().setFakeBoldText(true);
                } else {
                    textView5.setText(2131975674);
                    textView5.getPaint().setFakeBoldText(true);
                    TextView textView6 = c38525Gwl.A0E;
                    textView6.setVisibility(0);
                    textView6.setText(2131974097);
                }
                c38525Gwl.A0B.setVisibility(0);
            } else if (interfaceC38381qS instanceof C123675ig) {
                C123675ig c123675ig = (C123675ig) interfaceC38381qS;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.ui.state.BusinessConversionNetegoState");
                C42664IuL c42664IuL = (C42664IuL) obj;
                C693539v.A08(c38525Gwl, false);
                if (c42664IuL.A00 == EnumC114405Eh.A03) {
                    c38525Gwl.A01();
                }
                c38525Gwl.A00();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(EnumC114405Eh.A06, 2131968600);
                linkedHashMap2.put(EnumC114405Eh.A05, 2131968675);
                ArrayList arrayList5 = new ArrayList(linkedHashMap2.keySet());
                c38525Gwl.A02(arrayList5.size());
                textView.setText(2131975662);
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    EnumC114405Eh enumC114405Eh = (EnumC114405Eh) it2.next();
                    int indexOf2 = arrayList5.indexOf(enumC114405Eh);
                    ArrayList arrayList6 = c38525Gwl.A0J;
                    View requireViewById4 = ((View) arrayList6.get(indexOf2)).requireViewById(R.id.survey_tombstone_reason_text);
                    C14360o3.A07(requireViewById4);
                    TextView textView7 = (TextView) requireViewById4;
                    Object obj3 = linkedHashMap2.get(enumC114405Eh);
                    if (obj3 != null) {
                        textView7.setText(((Number) obj3).intValue());
                        C0fQ.A00(new ViewOnClickListenerC41983IjE(userSession, c123675ig, c38525Gwl, c42664IuL, enumC114405Eh), (View) arrayList6.get(indexOf2));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                if (interfaceC38381qS instanceof C47K) {
                    C1XV c1xv = ((C47K) interfaceC38381qS).A05;
                    if (c1xv == null) {
                        c1xv = C1XV.A0v;
                    }
                    if (c1xv == C1XV.A0p || c1xv == C1XV.A0t || c1xv == C1XV.A0v || c1xv == C1XV.A0r || c1xv == C1XV.A0n || c1xv == C1XV.A0s) {
                        Context context2 = view.getContext();
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.hashtags_netego_tombstone_height);
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        Object systemService2 = context2.getSystemService("window");
                        if (systemService2 != null) {
                            ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics2);
                            View view5 = c38525Gwl.A07;
                            ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                            layoutParams3.width = displayMetrics2.widthPixels;
                            layoutParams3.height = dimensionPixelSize;
                            view5.setLayoutParams(layoutParams3);
                            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.ui.state.DismissibleNetegoItemState");
                            InterfaceC114395Eg interfaceC114395Eg = (InterfaceC114395Eg) obj;
                            if (interfaceC38381qS != null) {
                                C1XV B5n = interfaceC38381qS.B5n();
                                C14360o3.A07(B5n);
                                if (interfaceC114395Eg.BDl() == EnumC114405Eh.A02) {
                                    C693539v.A07(c38525Gwl, 8);
                                    IQZ.A01(c38525Gwl, 8);
                                    switch (B5n.ordinal()) {
                                        case 2:
                                        case 5:
                                        case 7:
                                        case 8:
                                            i2 = 2131964596;
                                            break;
                                        case 3:
                                        case 4:
                                        case 6:
                                        case 9:
                                        default:
                                            i2 = 2131964594;
                                            break;
                                        case 10:
                                            i2 = 2131964597;
                                            break;
                                    }
                                    TextView textView8 = c38525Gwl.A0F;
                                    textView8.setText(i2);
                                    textView8.getPaint().setFakeBoldText(true);
                                    TextView textView9 = c38525Gwl.A0E;
                                    textView9.setVisibility(0);
                                    textView9.setText(2131964595);
                                    c38525Gwl.A0B.setVisibility(0);
                                    C693539v.A06(c38525Gwl);
                                }
                            } else {
                                illegalStateException = new IllegalArgumentException("Required value was null.");
                                i = -1338762662;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                if (interfaceC38381qS instanceof C42521Is0) {
                    c38525Gwl.A02 = this.A00;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.notes.model.NotesNetegoTrayState");
                    ViewOnClickListenerC41931IiO viewOnClickListenerC41931IiO = new ViewOnClickListenerC41931IiO((C42521Is0) interfaceC38381qS, (C42662IuJ) obj, c38525Gwl);
                    Resources resources2 = c38525Gwl.A08.getResources();
                    String string3 = resources2.getString(2131968761);
                    C14360o3.A07(string3);
                    String string4 = resources2.getString(2131968762);
                    C14360o3.A07(string4);
                    c38525Gwl.A03(new ViewOnClickListenerC41882IhK(c38525Gwl), UndoStyle.A04, C05F.A01, string3, string4);
                    C693539v.A02(viewOnClickListenerC41931IiO, c38525Gwl);
                } else if (interfaceC38381qS instanceof C4dV) {
                    c38525Gwl.A02 = this.A00;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.tifu.state.TifuNetegoState");
                    Resources resources3 = c38525Gwl.A08.getResources();
                    String string5 = resources3.getString(2131975583);
                    String string6 = resources3.getString(2131975584);
                    UndoStyle undoStyle = UndoStyle.A07;
                    CUQ cuq = new CUQ(new C84433pm(null, null, null, null, null, null, null, null, null, null, null));
                    cuq.A01 = string5;
                    cuq.A02 = NetInfoModule.CONNECTION_TYPE_NONE;
                    cuq.A03 = string6;
                    cuq.A00 = undoStyle;
                    C693539v.A01(new ViewOnClickListenerC41932IiP((C4dV) interfaceC38381qS, (C119835bh) obj, c38525Gwl), cuq.A00(), userSession, null, c38525Gwl, null);
                    C693539v.A03(ConfirmationStyle.A08, ConfirmationTitleStyle.A05, undoStyle, c38525Gwl);
                }
            }
            C0f9.A0A(-684405247, A032);
            return;
        }
        illegalStateException = new IllegalStateException("Required value was null.");
        i = -49489453;
        C0f9.A0A(i, A032);
        throw illegalStateException;
    }

    public final void A01(View view, UserSession userSession, InterfaceC38381qS interfaceC38381qS, Object obj) {
        int A032 = C0f9.A03(1578211090);
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(view, 1);
        A00(view, null, userSession, interfaceC38381qS, obj);
        C0f9.A0A(60070574, A032);
    }

    public C693439u(InterfaceC692739n interfaceC692739n, boolean z) {
        C14360o3.A0B(interfaceC692739n, 1);
        this.A00 = interfaceC692739n;
        this.A01 = z;
    }
}
