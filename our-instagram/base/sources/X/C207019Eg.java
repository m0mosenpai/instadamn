package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9Eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207019Eg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207019Eg(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [X.BLj, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC12990ll abstractC12990ll;
        C06090Tz c06090Tz;
        long j;
        switch (this.A00) {
            case 0:
                C685836v c685836v = (C685836v) this.A01;
                return new C37511GfT(c685836v.A02, c685836v.A0k, (C37502GfK) c685836v.A2O.getValue());
            case 1:
                C685836v c685836v2 = (C685836v) this.A01;
                return new C37507GfP(c685836v2.A02, c685836v2.A0k, (C37502GfK) c685836v2.A2O.getValue());
            case 2:
                C75443aB c75443aB = (C75443aB) this.A01;
                return new C147776l2((InterfaceC11380iw) c75443aB.A00, c75443aB.A03);
            case 3:
                C39F c39f = (C39F) this.A01;
                C9IC c9ic = new C9IC(c39f.A01, c39f.A02);
                ?? obj = new Object();
                obj.EXO(new C43359JEa(c9ic, 3));
                return obj;
            case 4:
                return AbstractC84973ql.A00(((C39F) this.A01).A02);
            case 5:
                return new C27823COm(((C39F) this.A01).A02);
            case 6:
                final UserSession userSession = (UserSession) this.A01;
                return new InterfaceC449925e(userSession) { // from class: X.26W
                    public final UserSession A00;
                    public final List A01 = new ArrayList();

                    @Override // X.InterfaceC449925e
                    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
                        return false;
                    }

                    @Override // X.InterfaceC449925e
                    public final String getContentInBackground(Context context) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = this.A01.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next());
                            }
                            return jSONArray.toString();
                        } catch (JSONException e) {
                            C0K8.A0F("FeedLastSeenMediasLogCollector", "Unable to create log", e);
                            return "{}";
                        }
                    }

                    @Override // X.InterfaceC449925e
                    public final String getFilenameSuffix() {
                        return RealtimeLogsProvider.LOG_SUFFIX;
                    }

                    @Override // X.InterfaceC449925e
                    public final String getTag() {
                        return "FeedLastSeenMediasLogCollector";
                    }

                    {
                        this.A00 = userSession;
                    }

                    @Override // X.InterfaceC449925e
                    public final String getFilenamePrefix() {
                        return "main_feed_last_seen_medias";
                    }
                };
            case 7:
                C006802i c006802i = (C006802i) this.A01;
                C14360o3.A0A(c006802i);
                return new C61712rY(c006802i);
            case 8:
                return new C74853Ya((UserSession) this.A01);
            case 9:
                UserSession userSession2 = (UserSession) this.A01;
                return new C3YT(C1AT.A01(userSession2).A04(C1AV.A1b, C3YT.class), userSession2);
            case 10:
                final UserSession userSession3 = (UserSession) this.A01;
                final C18A A00 = AnonymousClass189.A00(userSession3);
                final C1DX A002 = C1DW.A00(userSession3);
                return new C1DV(userSession3, A002, A00) { // from class: X.1DU
                    public final UserSession A00;
                    public final C1DX A01;
                    public final C18A A02;

                    @Override // X.C1DV
                    public final C17M AXG(String str, InterfaceC16510rw interfaceC16510rw) {
                        C17M A02;
                        C14360o3.A0B(str, 0);
                        if (C14360o3.A0K(interfaceC16510rw, new C0YZ(User.class))) {
                            A02 = this.A02.A02(str);
                        } else if (C14360o3.A0K(interfaceC16510rw, new C0YZ(C38321qM.class))) {
                            A02 = this.A01.A02(str);
                        } else {
                            return null;
                        }
                        return A02;
                    }

                    /* JADX WARN: Type inference failed for: r2v1, types: [X.1rF, java.lang.Object] */
                    @Override // X.C1DV
                    public final C17M E7H(C1DY c1dy, C17M c17m) {
                        C17M A01;
                        if (c17m instanceof User) {
                            java.util.Set set = c1dy.A01;
                            User user = (User) c17m;
                            if (set.contains(user.getId())) {
                                A01 = this.A02.A01(new User(user.getId(), null), false, true);
                            } else {
                                set.add(user.getId());
                                try {
                                    C18A c18a = this.A02;
                                    if (!C18U.A06(C06090Tz.A05, this.A00, 36327164104751453L)) {
                                        user = user.A0H(c1dy);
                                    }
                                    User A012 = c18a.A01(user, true, c1dy.A02);
                                    C14360o3.A0C(A012, "null cannot be cast to non-null type T of com.instagram.feed.media.IgUserMediaApiStore.putOrUpdate");
                                    return A012;
                                } catch (C90093zq unused) {
                                    return c17m;
                                }
                            }
                        } else {
                            if (!(c17m instanceof C38321qM)) {
                                return c17m;
                            }
                            java.util.Set set2 = c1dy.A01;
                            C38321qM c38321qM = (C38321qM) c17m;
                            if (AbstractC001800i.A0u(set2, c38321qM.getId())) {
                                C1DX c1dx = this.A01;
                                C38321qM c38321qM2 = new C38321qM(new C37761pD(null), new Object());
                                c38321qM2.A4P(c38321qM.getId());
                                A01 = c1dx.A01(c38321qM2, true, true);
                            } else {
                                String id = c38321qM.getId();
                                if (id == null) {
                                    return c17m;
                                }
                                set2.add(id);
                                C1DX c1dx2 = this.A01;
                                if (!C18U.A06(C06090Tz.A05, this.A00, 36327164104685916L)) {
                                    c38321qM = c38321qM.A1f(c1dy);
                                }
                                C38321qM A013 = c1dx2.A01(c38321qM, true, c1dy.A02);
                                C14360o3.A0C(A013, "null cannot be cast to non-null type T of com.instagram.feed.media.IgUserMediaApiStore.putOrUpdate$lambda$3");
                                return A013;
                            }
                        }
                        C14360o3.A0C(A01, "null cannot be cast to non-null type T of com.instagram.feed.media.IgUserMediaApiStore.putOrUpdate");
                        return A01;
                    }

                    @Override // X.C1DV
                    public final UserSession CE4() {
                        return this.A00;
                    }

                    {
                        this.A00 = userSession3;
                        this.A02 = A00;
                        this.A01 = A002;
                    }
                };
            case 11:
                return C1D3.A01.A00((UserSession) this.A01).A00().consistencyService;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C1DX((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C80553ik((UserSession) this.A01);
            case 14:
                C92854Eb c92854Eb = (C92854Eb) this.A01;
                return new C92884Ee(c92854Eb.A06, c92854Eb.A05.getModuleName());
            case Process.SIGTERM /* 15 */:
                return this.A01;
            case 16:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 17:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 18:
                return new C24461Hp((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return Integer.valueOf((int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36601848735797622L));
            case 20:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 37164798688887152L;
                break;
            case 21:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 37164798688952689L;
                break;
            case 22:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 37164798689018226L;
                break;
            case 23:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 37164798689083763L;
                break;
            case 24:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 37164798689149300L;
                break;
            case 25:
                return Integer.valueOf((int) C18U.A00(C06090Tz.A05, (AbstractC12990ll) this.A01, 37164798689476981L));
            case 26:
                return Integer.valueOf((int) C18U.A00(C06090Tz.A05, (AbstractC12990ll) this.A01, 37164798689542518L));
            case 27:
                return new C689838k((UserSession) this.A01);
            case 28:
                return ((C4dV) this.A01).A06;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C65872yP c65872yP = (C65872yP) this.A01;
                if (c65872yP.A08) {
                    return new C2R(c65872yP.A02, c65872yP.A03, c65872yP.A04);
                }
                return null;
            case 30:
                TifuViewModel tifuViewModel = (TifuViewModel) this.A01;
                tifuViewModel.A08.A01(((C132335yC) tifuViewModel.A0G.getValue()).A06);
                return C0eB.A00;
            case 31:
            case 32:
            default:
                ((InterfaceC16820sZ) this.A01).invoke();
                return C0eB.A00;
            case 33:
                return new C116785Qh((View) this.A01);
            case 34:
                return new C37514GfW((Context) this.A01);
            case 35:
                return new C47935LFj((UserSession) this.A01);
            case 36:
                AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A01;
                return new C97354Yu((C4FZ) anonymousClass398.A0V.getValue(), (C84903qe) anonymousClass398.A0f.getValue());
            case 37:
                return new C37512GfU((Context) this.A01);
            case 38:
                return new C39446HbY((Context) this.A01);
            case 39:
                InterfaceC09390do interfaceC09390do = ((C86103sh) this.A01).A0I;
                Object value = interfaceC09390do.getValue();
                C14360o3.A07(value);
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                return C3LQ.A06((Context) value, R.drawable.instagram_reels_filled_12, AbstractC53242c7.A0H((Context) value2, R.attr.igds_color_icon_on_white));
            case 40:
                InterfaceC09390do interfaceC09390do2 = ((C86103sh) this.A01).A0I;
                Object value3 = interfaceC09390do2.getValue();
                C14360o3.A07(value3);
                Object value4 = interfaceC09390do2.getValue();
                C14360o3.A07(value4);
                return C3LQ.A06((Context) value3, R.drawable.instagram_arrow_ccw_pano_filled_12, AbstractC53242c7.A0H((Context) value4, R.attr.igds_color_icon_on_white));
            case Seq.NULL_REFNUM /* 41 */:
                Object value5 = ((C86103sh) this.A01).A0I.getValue();
                C14360o3.A07(value5);
                return C3LQ.A06((Context) value5, R.drawable.instagram_reels_filled_12, R.color.audio_bar_action_color_enabled);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((C86103sh) this.A01).A01().getContext();
            case 43:
                Object value6 = ((C86103sh) this.A01).A0I.getValue();
                C14360o3.A07(value6);
                return C3LQ.A06((Context) value6, R.drawable.instagram_direct_pano_filled_12, R.color.audio_bar_action_color_enabled);
            case 44:
                return ((C86123sj) this.A01).A01.A01();
            case 45:
                return new C86823tu(((C76173bM) this.A01).A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                final UserSession userSession4 = ((C76173bM) this.A01).A00;
                return new Object(userSession4) { // from class: X.3u0
                    public final UserSession A00;

                    {
                        this.A00 = userSession4;
                    }
                };
            case 47:
                ((View) this.A01).clearAnimation();
                return C0eB.A00;
            case 48:
                IgProgressImageView igProgressImageView = (IgProgressImageView) this.A01;
                igProgressImageView.getIgImageView().setImageBitmap(null);
                igProgressImageView.setBackgroundColor(igProgressImageView.getContext().getColor(R.color.gradient_dark));
                return C0eB.A00;
            case 49:
                ((IgProgressImageView) this.A01).setScaleType(ImageView.ScaleType.FIT_CENTER);
                return C0eB.A00;
        }
        return Double.valueOf(C18U.A00(c06090Tz, abstractC12990ll, j));
    }
}
