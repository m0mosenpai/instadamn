package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.LruCache;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.KEq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45551KEq extends C1P1 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C45551KEq(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        boolean z;
        View view;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(919172353);
                C14360o3.A0B(abstractC115105If, 0);
                Context context = ((C48592LeU) this.A01).A04;
                C9GR.A00(context, AbstractC47839LBc.A00(context, abstractC115105If), "launch_failed_web_link_validation", 0);
                i = -2110999034;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-556006278);
                C14360o3.A0B(abstractC115105If, 0);
                InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
                if (interfaceC40821up != null) {
                    z = interfaceC40821up.getNewsURLIsRegulated();
                } else {
                    z = false;
                }
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                if (C18U.A06(C06090Tz.A05, c48592LeU.A06, 36319411686088102L) && interfaceC40821up != null && z) {
                    String errorMessage = interfaceC40821up.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = AbstractC47839LBc.A00(c48592LeU.A04, abstractC115105If);
                        C14360o3.A07(errorMessage);
                    }
                    L57 l57 = c48592LeU.A01;
                    if (l57 != null) {
                        view = l57.A01;
                    } else {
                        view = null;
                    }
                    AbstractC13880nE.A0O(view);
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    A0K.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                    A0K.A0D = errorMessage;
                    A0K.A0R = true;
                    A0K.A0L = true;
                    AbstractC31175DnJ.A0l(c48592LeU.A04, A0K, 2131968495);
                    A0K.A0A(new C49490Lu3(c48592LeU, 1));
                    AbstractC25233BEq.A1F(A0K);
                } else {
                    Context context2 = c48592LeU.A04;
                    C9GR.A00(context2, AbstractC47839LBc.A00(context2, abstractC115105If), "save_failed_web_link_validation", 0);
                }
                i = 1980246677;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1179339268);
                super.onFail(abstractC115105If);
                i = 154927505;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 913197776);
                AbstractC47789L8v abstractC47789L8v = (AbstractC47789L8v) this.A01;
                String str2 = this.A02;
                if (abstractC47789L8v instanceof KQO) {
                    KD6 kd6 = ((KQO) abstractC47789L8v).A00;
                    LAG lag = kd6.A0D;
                    if (lag == null) {
                        str = "stickerItemController";
                    } else {
                        boolean A05 = lag.A05();
                        LAG lag2 = kd6.A0C;
                        if (lag2 == null) {
                            str = "gifItemController";
                        } else {
                            KD6.A01(kd6, A05, lag2.A05());
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (abstractC47789L8v instanceof KQN) {
                    ((KQN) abstractC47789L8v).A01.DFh(abstractC115105If, str2);
                } else if (abstractC47789L8v instanceof KQM) {
                    ((KQM) abstractC47789L8v).A00.onFail(abstractC115105If);
                } else {
                    LRC.A00(((KQL) abstractC47789L8v).A00, false);
                }
                i = -1674611040;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(719130524);
                C23104AGq c23104AGq = (C23104AGq) this.A01;
                Integer num = C05F.A0C;
                LruCache lruCache = C23104AGq.A04;
                InterfaceC190008bJ interfaceC190008bJ = c23104AGq.A00;
                if (interfaceC190008bJ != null) {
                    interfaceC190008bJ.DQw(num);
                    c23104AGq.A00 = null;
                }
                C0w9.A03("MusicEditLyricsHelper", AnonymousClass001.A0R("lyrics fetching failed for musicAssetId = ", this.A02));
                i = 1213747224;
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        IgTextView igTextView;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-74662913);
                ((C48592LeU) this.A01).A02 = false;
                i = -1755625773;
                break;
            case 1:
                A03 = C0f9.A03(-1517241766);
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                c48592LeU.A02 = false;
                L57 l57 = c48592LeU.A01;
                if (l57 != null && (igTextView = l57.A08) != null) {
                    igTextView.setTextColor(-1);
                }
                i = 2045791964;
                break;
            case 2:
                A03 = C0f9.A03(-1234846614);
                ((L3P) this.A01).A04.hide();
                i = -751258017;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        String str;
        IgTextView igTextView;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1890759998);
                ((C48592LeU) this.A01).A02 = true;
                i = 1843038857;
                break;
            case 1:
                A03 = C0f9.A03(-943336773);
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                c48592LeU.A02 = true;
                L57 l57 = c48592LeU.A01;
                if (l57 != null && (igTextView = l57.A08) != null) {
                    AbstractC166987dD.A1O(c48592LeU.A04, igTextView, AbstractC53242c7.A09(c48592LeU.A03));
                }
                i = 996630624;
                break;
            case 2:
            default:
                super.onStart();
                return;
            case 3:
                A03 = C0f9.A03(-720839640);
                AbstractC47789L8v abstractC47789L8v = (AbstractC47789L8v) this.A01;
                String str2 = this.A02;
                if (abstractC47789L8v instanceof KQO) {
                    KD6 kd6 = ((KQO) abstractC47789L8v).A00;
                    LAG lag = kd6.A0D;
                    if (lag == null) {
                        str = "stickerItemController";
                    } else {
                        lag.A00();
                        LAG lag2 = kd6.A0C;
                        if (lag2 == null) {
                            str = "gifItemController";
                        } else {
                            lag2.A00();
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (abstractC47789L8v instanceof KQN) {
                    ((KQN) abstractC47789L8v).A01.Dnu(str2);
                } else if (abstractC47789L8v instanceof KQM) {
                    ((KQM) abstractC47789L8v).A00.onStart();
                } else {
                    LRC.A00(((KQL) abstractC47789L8v).A00, true);
                }
                i = -593813758;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        C194808jg A00;
        IgEditText igEditText;
        Editable text;
        String obj2;
        List list;
        int i2;
        String str;
        int i3;
        InterfaceC190008bJ interfaceC190008bJ;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-705503579);
                int A032 = C0f9.A03(-755755505);
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                Activity activity = c48592LeU.A03;
                if (!activity.isFinishing()) {
                    C63397SjR A0y = AbstractC25228BEl.A0y(activity, c48592LeU.A06, C2Fb.A3C, this.A02);
                    A0y.A0S = "link_sticker_creation";
                    A0y.A0A();
                }
                C0f9.A0A(1276837347, A032);
                i = 1191234562;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-1209659597);
                int A033 = C0f9.A03(1785851199);
                C48592LeU c48592LeU2 = (C48592LeU) this.A01;
                InterfaceC186178Nl interfaceC186178Nl = c48592LeU2.A07;
                String str2 = this.A02;
                L57 l57 = c48592LeU2.A01;
                String str3 = null;
                if (l57 != null && (igEditText = l57.A05) != null && (text = igEditText.getText()) != null && (obj2 = text.toString()) != null && AbstractC25225BEi.A1Y(obj2)) {
                    str3 = obj2;
                }
                C8NW c8nw = (C8NW) interfaceC186178Nl;
                InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
                Iterator it = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
                while (it.hasNext()) {
                    C194808jg c194808jg = (C194808jg) it.next();
                    if (c194808jg.A0E(C133115zd.class)) {
                        interactiveDrawableContainer.A0Q(c194808jg);
                    }
                }
                UserSession userSession = c8nw.A0r;
                boolean A01 = AbstractC172687md.A01(userSession);
                Context context = c8nw.A0f;
                if (A01) {
                    A00 = ADS.A01(context, userSession, str2, str3, interactiveDrawableContainer.getWidth(), false, false);
                } else {
                    C8NW.A0A(c8nw);
                    A00 = ADS.A00(context, userSession, str2, str3, interactiveDrawableContainer.getWidth());
                }
                C14360o3.A0B(context, 1);
                float A04 = AbstractC25235BEs.A04(context);
                float A042 = AbstractC166987dD.A04(context.getResources(), R.dimen.abc_dropdownitem_icon_width);
                float A06 = AbstractC43594JPz.A06(context);
                float intrinsicHeight = A00.getIntrinsicHeight();
                c8nw.A1J(A00, new C8FC(true, (C8D0) null, false, (String) null, false, true, true, true, true, true, (Integer) null, false, (C8FD) null, false, true, A04 / intrinsicHeight, A042 / intrinsicHeight, (C89G) null, true, C05F.A00, (Integer) null, 0, -1.0f, (List) null, -1.0f, A06 / intrinsicHeight, (Object) "StickerOverlayController", true, false), C148276lx.A14.A01());
                C48592LeU.A02(c48592LeU2, true);
                AbstractC25651Mw.A00(c48592LeU2.A06).E4s(new Object());
                C0f9.A0A(714107484, A033);
                i = 322838169;
                C0f9.A0A(i, A03);
                return;
            case 2:
                int A034 = C0f9.A03(-1678640317);
                K8D k8d = (K8D) obj;
                int A0N = AbstractC167017dG.A0N(k8d, 941110695);
                KDM kdm = ((L3P) this.A01).A03;
                String str4 = this.A02;
                C66618UPf c66618UPf = k8d.A00;
                if (c66618UPf != null) {
                    DirectThreadThemeInfo A002 = AbstractC69936Vy7.A00(c66618UPf);
                    C3o9 c3o9 = kdm.A08;
                    if (kdm.getActivity() != null && c3o9 != null) {
                        Bundle A0b = AbstractC166987dD.A0b();
                        InterfaceC09390do interfaceC09390do = kdm.A0Q;
                        AbstractC03240Dh.A00(A0b, AbstractC166987dD.A0o(interfaceC09390do));
                        A0b.putString("ARGUMENT_UPLOAD_ID", str4);
                        A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY", (Parcelable) c3o9);
                        A0b.putParcelable("ARGUEMENT_THEME", A002);
                        A0b.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUDIENCE_TYPE", kdm.A00);
                        A0b.putSerializable("ARGUMENT_PREVIEW_TYPE", C05F.A00);
                        C6XJ A035 = C6XJ.A03(kdm.requireActivity(), A0b, AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, AbstractC111324zv.A00(4236));
                        A035.A07();
                        A035.A0D(kdm, 100);
                    }
                    C0f9.A0A(-541059872, A0N);
                    C0f9.A0A(-1273749173, A034);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(1352802779, A0N);
                throw A0g;
            case 3:
                A03 = C0f9.A03(1969148526);
                C40781ul c40781ul = (C40781ul) obj;
                int A0N2 = AbstractC167017dG.A0N(c40781ul, -404371299);
                AbstractC47789L8v abstractC47789L8v = (AbstractC47789L8v) this.A01;
                String str5 = abstractC47789L8v.A00;
                String str6 = this.A02;
                if (!C14360o3.A0K(str5, str6)) {
                    i2 = -1100235362;
                } else {
                    if (abstractC47789L8v instanceof KQO) {
                        KQO kqo = (KQO) abstractC47789L8v;
                        InterfaceC50474MQc interfaceC50474MQc = kqo.A01;
                        List E3Y = interfaceC50474MQc.E3Y(c40781ul, EnumC46201Kcd.GIPHY_STICKERS, str6);
                        List E3Y2 = interfaceC50474MQc.E3Y(c40781ul, EnumC46201Kcd.GIPHY_GIFS, str6);
                        KD6 kd6 = kqo.A00;
                        LAG lag = kd6.A0D;
                        if (lag == null) {
                            str = "stickerItemController";
                        } else {
                            lag.A03(E3Y);
                            LAG lag2 = kd6.A0C;
                            if (lag2 == null) {
                                str = "gifItemController";
                            } else {
                                lag2.A03(E3Y2);
                                KD6.A01(kd6, E3Y.isEmpty(), E3Y2.isEmpty());
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    if (abstractC47789L8v instanceof KQN) {
                        KQN kqn = (KQN) abstractC47789L8v;
                        InterfaceC50474MQc interfaceC50474MQc2 = kqn.A00;
                        List E3Y3 = interfaceC50474MQc2.E3Y(c40781ul, EnumC46201Kcd.GIPHY_STICKERS, str6);
                        if ((interfaceC50474MQc2 instanceof C48731Lgz) && (c40781ul instanceof K8R)) {
                            K8R k8r = (K8R) c40781ul;
                            C14360o3.A0B(k8r, 0);
                            list = k8r.A01.A01;
                            if (list == null) {
                                list = C16930sl.A00;
                            }
                        } else {
                            list = null;
                        }
                        kqn.A01.DqH(E3Y3, list, str6);
                    } else if (abstractC47789L8v instanceof KQM) {
                        KQM kqm = (KQM) abstractC47789L8v;
                        InterfaceC50474MQc interfaceC50474MQc3 = kqm.A01;
                        kqm.A00.DqG(interfaceC50474MQc3.E3Y(c40781ul, EnumC46201Kcd.GIPHY_GIFS, str6), interfaceC50474MQc3.E3X(c40781ul));
                    } else {
                        KQL kql = (KQL) abstractC47789L8v;
                        K8R k8r2 = (K8R) c40781ul;
                        C14360o3.A0B(k8r2, 0);
                        List<C148336m3> A12 = AbstractC43594JPz.A12(k8r2.A01.A02);
                        C14360o3.A07(A12);
                        ArrayList A0q = AbstractC167017dG.A0q(A12);
                        for (C148336m3 c148336m3 : A12) {
                            C14360o3.A0A(c148336m3);
                            A0q.add(new C148306m0(c148336m3));
                        }
                        LRC lrc = kql.A00;
                        LRC.A00(lrc, false);
                        lrc.A02.A05(A0q);
                    }
                    i2 = 1628907585;
                }
                C0f9.A0A(i2, A0N2);
                i = 326265743;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(823367371);
                C214409ee c214409ee = (C214409ee) obj;
                int A0N3 = AbstractC167017dG.A0N(c214409ee, 469039234);
                C38059Gom c38059Gom = c214409ee.A00;
                if (c38059Gom == null) {
                    C23104AGq c23104AGq = (C23104AGq) this.A01;
                    Integer num = C05F.A01;
                    LruCache lruCache = C23104AGq.A04;
                    InterfaceC190008bJ interfaceC190008bJ2 = c23104AGq.A00;
                    if (interfaceC190008bJ2 != null) {
                        interfaceC190008bJ2.DQw(num);
                        c23104AGq.A00 = null;
                    }
                    i3 = 1459566356;
                } else {
                    LruCache lruCache2 = C23104AGq.A04;
                    String str7 = this.A02;
                    lruCache2.put(str7, c38059Gom);
                    C23104AGq c23104AGq2 = (C23104AGq) this.A01;
                    if (C14360o3.A0K(str7, c23104AGq2.A01) && (interfaceC190008bJ = c23104AGq2.A00) != null) {
                        interfaceC190008bJ.DQx(c38059Gom);
                        c23104AGq2.A00 = null;
                    }
                    c23104AGq2.A01 = null;
                    i3 = -567978280;
                }
                C0f9.A0A(i3, A0N3);
                i = 648529943;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
