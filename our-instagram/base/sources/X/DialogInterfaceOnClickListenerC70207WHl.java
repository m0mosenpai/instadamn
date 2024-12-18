package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.BaseBundle;
import android.widget.NumberPicker;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.WHl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC70207WHl implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DialogInterfaceOnClickListenerC70207WHl(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.WfZ, X.1vN] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        switch (this.A00) {
            case 2:
                UserSession userSession = (UserSession) this.A04;
                AbstractC68464VRu.A00((FragmentActivity) this.A03, (XIGIGBoostDestination) this.A02, userSession, ((BaseBundle) this.A01).getString("media_id"));
                C70399WUb.A00(userSession).A0G(VG4.A1P, "customize_button_of_success_dialog");
                return;
            case 3:
                W44.A00 = false;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                int value = ((NumberPicker) this.A01).getValue();
                ((InterfaceC16620sF) this.A02).invoke(Integer.valueOf(value), ((Integer[]) this.A04)[((NumberPicker) this.A03).getValue()]);
                return;
            case 4:
                C14360o3.A0A(dialogInterface);
                UserSession userSession2 = (UserSession) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                U0K u0k = (U0K) this.A03;
                Context context = (Context) this.A01;
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession2);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "clear_search_history");
                AbstractC37302Gc3.A0t(A00);
                A00.Cht();
                C25671My A002 = AbstractC25651Mw.A00(userSession2);
                ?? obj = new Object();
                obj.A00 = true;
                A002.E4s(obj);
                if (C37011ny.A00 != null) {
                    U04.A00();
                    C66081TzI c66081TzI = new C66081TzI(new C69153Vii(context, userSession2, u0k), 36);
                    int ordinal = u0k.ordinal();
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                    if (ordinal == 5) {
                        A0c.A0B("map/clear_recent_searches/");
                        AbstractC31173DnH.A1N(A0c);
                        A0c.A0R = true;
                    } else {
                        A0c.A0B("fbsearch/clear_search_history/");
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        str = null;
                                    } else {
                                        str = MediaStreamTrack.AUDIO_TRACK_KIND;
                                    }
                                } else {
                                    str = "place";
                                }
                            } else {
                                str = "hashtag";
                            }
                        } else {
                            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                        }
                        A0c.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                        AbstractC31173DnH.A1N(A0c);
                    }
                    C1ON A0N = A0c.A0N();
                    A0N.A00 = c66081TzI;
                    C1GJ.A03(A0N);
                }
                dialogInterface.dismiss();
                return;
            default:
                C6FQ c6fq = (C6FQ) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FX c6fx = new C6FX();
                c6fx.A01(this.A04);
                c6fx.A02(this.A01);
                AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
                return;
        }
    }
}
