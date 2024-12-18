package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.direct.visual.DirectVisualMessageViewerControllerLifecycleUtil;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.volume.VolumeIndicator;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCV extends AbstractC59962oe implements InterfaceC60072op, InterfaceC1119353f {
    public static final String __redex_internal_original_name = "DirectVisualMessageViewerFragment";
    public UserSession A00;
    public DirectVisualMessageViewerController A01;
    public InterfaceC1119053c A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_story_viewer_fragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2;
        View view3;
        SegmentedProgressBar segmentedProgressBar;
        CircularImageView circularImageView;
        VolumeIndicator volumeIndicator;
        View view4;
        C47946LGa c47946LGa;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        C42221xC A05;
        String str2;
        C42221xC A052;
        C42221xC A00;
        SegmentedProgressBar segmentedProgressBar2;
        C45093JxN A01;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C30D.A03(requireActivity());
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
            Window window = fragmentActivity.getWindow();
            C14360o3.A07(window);
            AbstractC13440mV.A05(window);
            C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
            if (c47946LGa2 != null && (A01 = c47946LGa2.A01(c47946LGa2.A00)) != null) {
                str = A01.A0G;
            } else {
                str = null;
            }
            C7DO c7do = directVisualMessageViewerController.A0s;
            c7do.A01(str);
            C47946LGa c47946LGa3 = directVisualMessageViewerController.A0G;
            if (c47946LGa3 != null) {
                boolean z = directVisualMessageViewerController.A1C;
                InterfaceC60442pS interfaceC60442pS = directVisualMessageViewerController.A0v;
                String str3 = directVisualMessageViewerController.A16;
                UserSession userSession = directVisualMessageViewerController.A0m;
                C46087Kal c46087Kal = new C46087Kal(userSession, c47946LGa3, c7do, interfaceC60442pS, str3, z);
                AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
                directVisualMessageViewerController.videoPlayer = new C49685LxG(fragmentActivity, userSession, c46087Kal, directVisualMessageViewerController, abstractC59962oe.getModuleName());
                directVisualMessageViewerController.photoTimerController = new C147326kI(directVisualMessageViewerController);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout != null) {
                    view2 = touchInterceptorFrameLayout.findViewById(R.id.direct_visual_message_viewer_root_container);
                } else {
                    view2 = null;
                }
                directVisualMessageViewerController.rootView = view2;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout2 != null) {
                    directVisualMessageViewerController.contentView = touchInterceptorFrameLayout2.requireViewById(R.id.direct_expiring_media_viewer_content);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout3 != null) {
                        view3 = touchInterceptorFrameLayout3.findViewById(R.id.direct_expiring_media_viewer_container);
                    } else {
                        view3 = null;
                    }
                    directVisualMessageViewerController.itemView = view3;
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout4 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout4 != null) {
                        ViewStub A0M = AbstractC167007dF.A0M(touchInterceptorFrameLayout4, R.id.direct_media_view_stub);
                        A0M.setLayoutResource(R.layout.layout_rounded_media);
                        A0M.inflate();
                        View view5 = directVisualMessageViewerController.contentView;
                        if (view5 != null) {
                            View requireViewById = view5.requireViewById(R.id.viewer_info_header);
                            directVisualMessageViewerController.viewerInfoContainer = requireViewById;
                            if (requireViewById != null) {
                                requireViewById.setVisibility(0);
                            }
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout5 = directVisualMessageViewerController.viewerContainer;
                            if (touchInterceptorFrameLayout5 != null) {
                                segmentedProgressBar = (SegmentedProgressBar) touchInterceptorFrameLayout5.findViewById(R.id.reel_viewer_progress_bar);
                            } else {
                                segmentedProgressBar = null;
                            }
                            directVisualMessageViewerController.progressBar = segmentedProgressBar;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, userSession, 36324282179006535L) && (segmentedProgressBar2 = directVisualMessageViewerController.progressBar) != null) {
                                segmentedProgressBar2.setLayerType(1, null);
                            }
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout6 = directVisualMessageViewerController.viewerContainer;
                            if (touchInterceptorFrameLayout6 != null) {
                                circularImageView = (CircularImageView) touchInterceptorFrameLayout6.findViewById(R.id.profile_transition_view);
                            } else {
                                circularImageView = null;
                            }
                            directVisualMessageViewerController.A0A = circularImageView;
                            View view6 = directVisualMessageViewerController.contentView;
                            if (view6 != null) {
                                L5Y l5y = new L5Y(fragmentActivity, view6, userSession);
                                directVisualMessageViewerController.contentHolder = l5y;
                                View view7 = directVisualMessageViewerController.contentView;
                                if (view7 != null) {
                                    view7.setTag(l5y);
                                }
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout7 = directVisualMessageViewerController.viewerContainer;
                                if (touchInterceptorFrameLayout7 != null) {
                                    volumeIndicator = (VolumeIndicator) touchInterceptorFrameLayout7.findViewById(R.id.direct_expiring_media_viewer_volume_indicator);
                                } else {
                                    volumeIndicator = null;
                                }
                                directVisualMessageViewerController.volumeIndicator = volumeIndicator;
                                C3o9 c3o9 = directVisualMessageViewerController.A0x;
                                directVisualMessageViewerController.A0B = new L5M(userSession, str3, JRE.A06(c3o9), z);
                                directVisualMessageViewerController.A0C = new C43931Jbg(userSession);
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout8 = directVisualMessageViewerController.viewerContainer;
                                if (touchInterceptorFrameLayout8 != null) {
                                    View requireViewById2 = touchInterceptorFrameLayout8.requireViewById(R.id.direct_visual_message_viewer_composer_container);
                                    directVisualMessageViewerController.replyComposerContainer = requireViewById2;
                                    if (requireViewById2 != null) {
                                        directVisualMessageViewerController.replyComposer = requireViewById2.requireViewById(R.id.direct_visual_message_viewer_composer);
                                        View view8 = directVisualMessageViewerController.replyComposerContainer;
                                        if (view8 != null) {
                                            EditText editText = (EditText) view8.requireViewById(R.id.direct_expiring_media_viewer_composer_edit_text);
                                            directVisualMessageViewerController.composerEditText = editText;
                                            if (editText != null) {
                                                editText.setVisibility(AbstractC167007dF.A05(directVisualMessageViewerController.A1B ? 1 : 0));
                                            }
                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout9 = directVisualMessageViewerController.viewerContainer;
                                            if (touchInterceptorFrameLayout9 != null) {
                                                view4 = touchInterceptorFrameLayout9.findViewById(R.id.background_dimmer);
                                            } else {
                                                view4 = null;
                                            }
                                            directVisualMessageViewerController.backgroundDimmer = view4;
                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout10 = directVisualMessageViewerController.viewerContainer;
                                            if (touchInterceptorFrameLayout10 != null) {
                                                directVisualMessageViewerController.privacyOverlayStubHolder = AbstractC37301Gc2.A0D(touchInterceptorFrameLayout10, R.id.visual_privacy_overlay_stub);
                                                C2EC c2ec = directVisualMessageViewerController.A0n;
                                                if (c2ec != null && c2ec.CWO()) {
                                                    View view9 = directVisualMessageViewerController.replyComposer;
                                                    if (view9 != null) {
                                                        AbstractC31173DnH.A0z(view9.getContext(), view9, R.drawable.visual_message_viewer_composer_background_shhmode);
                                                    }
                                                    directVisualMessageViewerController.A0W = true;
                                                } else {
                                                    View view10 = directVisualMessageViewerController.replyComposer;
                                                    if (view10 != null) {
                                                        AbstractC31173DnH.A0z(view10.getContext(), view10, R.drawable.visual_message_viewer_composer_background);
                                                    }
                                                    directVisualMessageViewerController.A0W = false;
                                                }
                                                EditText editText2 = directVisualMessageViewerController.composerEditText;
                                                if (editText2 != null) {
                                                    editText2.setOnEditorActionListener(new LRL(directVisualMessageViewerController, 1));
                                                }
                                                View view11 = directVisualMessageViewerController.replyComposerContainer;
                                                if (view11 != null) {
                                                    View A0S = AbstractC166997dE.A0S(view11, R.id.direct_expiring_media_viewer_composer_camera_button);
                                                    boolean z2 = directVisualMessageViewerController.A1G;
                                                    if (z2) {
                                                        if ((c3o9 instanceof DirectThreadKey) && c2ec != null && c2ec.CWO()) {
                                                            AbstractC31173DnH.A0z(A0S.getContext(), A0S, R.drawable.reels_composer_camera_button_ring_shhmode);
                                                        } else {
                                                            AbstractC31173DnH.A0z(A0S.getContext(), A0S, R.drawable.reels_composer_camera_button_ring);
                                                        }
                                                        A0S.setVisibility(0);
                                                        C0fQ.A00(new LQ1(41, directVisualMessageViewerController, A0S), A0S);
                                                        C47428KxJ c47428KxJ = directVisualMessageViewerController.A0u;
                                                        UserSession userSession2 = c47428KxJ.A00;
                                                        if (AbstractC166987dD.A0x(userSession2).getInt("camera_reply_tooltip_impression_count", 0) < 3 && C18U.A06(c06090Tz, userSession2, 36325506244949123L)) {
                                                            A0S.postDelayed(new RunnableC50001M5q(fragmentActivity, A0S, c47428KxJ), 1000L);
                                                        }
                                                    } else {
                                                        A0S.setVisibility(8);
                                                    }
                                                    View view12 = directVisualMessageViewerController.replyComposerContainer;
                                                    if (view12 != null) {
                                                        View requireViewById3 = view12.requireViewById(R.id.direct_expiring_media_text_send_button);
                                                        directVisualMessageViewerController.textSendButton = requireViewById3;
                                                        if (requireViewById3 != null) {
                                                            ViewOnClickListenerC48062LPn.A00(requireViewById3, 65, directVisualMessageViewerController);
                                                        }
                                                        directVisualMessageViewerController.composerTextWatcher = new LO2(directVisualMessageViewerController, 13);
                                                        C3I8 A012 = C3I7.A01(directVisualMessageViewerController, false, false);
                                                        directVisualMessageViewerController.keyboardHeightChangeDetector = A012;
                                                        A012.A9e(directVisualMessageViewerController);
                                                        boolean z3 = c3o9 instanceof MsysThreadId;
                                                        if (z3 && !z2) {
                                                            View view13 = directVisualMessageViewerController.replyComposerContainer;
                                                            RectF rectF = AbstractC13880nE.A01;
                                                            if (view13 != null) {
                                                                view13.setVisibility(8);
                                                            }
                                                            directVisualMessageViewerController.replyComposerContainer = null;
                                                        }
                                                        TouchInterceptorFrameLayout touchInterceptorFrameLayout11 = directVisualMessageViewerController.viewerContainer;
                                                        if (touchInterceptorFrameLayout11 != null) {
                                                            View findViewById = touchInterceptorFrameLayout11.findViewById(R.id.direct_expiring_media_view_once_pause_sparkler_stub);
                                                            C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
                                                            directVisualMessageViewerController.sparklerAnimationStubHolder = new C57012jc((ViewStub) findViewById);
                                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout12 = directVisualMessageViewerController.viewerContainer;
                                                            if (touchInterceptorFrameLayout12 != null) {
                                                                directVisualMessageViewerController.blurImageViewContainerStubHolder = AbstractC31177DnL.A0V(touchInterceptorFrameLayout12, R.id.direct_expiring_media_blur_image_stub);
                                                                View view14 = directVisualMessageViewerController.itemView;
                                                                if (view14 != null) {
                                                                    directVisualMessageViewerController.A0M = new C148536mO(fragmentActivity, view14, abstractC59962oe, userSession, interfaceC60442pS, directVisualMessageViewerController.A0z);
                                                                    C47946LGa c47946LGa4 = directVisualMessageViewerController.A0G;
                                                                    if (c47946LGa4 != null && c47946LGa4.A01 > 0 && directVisualMessageViewerController.contentHolder != null) {
                                                                        View view15 = directVisualMessageViewerController.contentView;
                                                                        if (view15 != null) {
                                                                            view15.setVisibility(4);
                                                                        }
                                                                        if (directVisualMessageViewerController.A0Q != null) {
                                                                            User A10 = AbstractC166987dD.A10(userSession);
                                                                            String str4 = directVisualMessageViewerController.A0Q;
                                                                            if (str4 != null) {
                                                                                DirectVisualMessageViewerController.A00(directVisualMessageViewerController, A10, str4);
                                                                                directVisualMessageViewerController.A0Q = null;
                                                                            } else {
                                                                                throw AbstractC166987dD.A14("Required value was null.");
                                                                            }
                                                                        }
                                                                        C45093JxN A002 = c47946LGa4.A00();
                                                                        L5Y l5y2 = directVisualMessageViewerController.contentHolder;
                                                                        if (l5y2 != null) {
                                                                            l5y2.A0J.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
                                                                            if (A002.A0S && !A002.A0R) {
                                                                                L5Y l5y3 = directVisualMessageViewerController.contentHolder;
                                                                                if (l5y3 != null) {
                                                                                    l5y3.A0J.A0A(new C49407Lsf(directVisualMessageViewerController, 2), R.id.direct_visual_message_viewer_fragment_image_view_id);
                                                                                } else {
                                                                                    throw AbstractC166987dD.A14("Required value was null.");
                                                                                }
                                                                            } else {
                                                                                View view16 = directVisualMessageViewerController.contentView;
                                                                                if (view16 != null) {
                                                                                    AbstractC13880nE.A0q(view16, new RunnableC49885M1e(directVisualMessageViewerController));
                                                                                } else {
                                                                                    throw AbstractC166987dD.A14("Required value was null.");
                                                                                }
                                                                            }
                                                                            List list = c47946LGa4.A03;
                                                                            int size = list.size();
                                                                            int i = 0;
                                                                            while (true) {
                                                                                if (i < size) {
                                                                                    C45093JxN A013 = c47946LGa4.A01(i);
                                                                                    if (A013 != null && A013.A09 != null) {
                                                                                        L05 l05 = new L05(userSession);
                                                                                        directVisualMessageViewerController.A0J = l05;
                                                                                        C41761wQ c41761wQ = directVisualMessageViewerController.A0l;
                                                                                        C47946LGa c47946LGa5 = directVisualMessageViewerController.A0G;
                                                                                        if (c47946LGa5 != null) {
                                                                                            List list2 = c47946LGa5.A03;
                                                                                            ArrayList A0q = AbstractC25230BEn.A0q(list2);
                                                                                            ArrayList A0q2 = AbstractC25230BEn.A0q(list2);
                                                                                            int size2 = list2.size();
                                                                                            for (int i2 = 0; i2 < size2; i2++) {
                                                                                                C45093JxN A014 = c47946LGa5.A01(i2);
                                                                                                if (A014 != null && A014.A09 != null) {
                                                                                                    DirectVisualMessageItemModel.MediaFields.TamMedia tamMedia = A014.A09;
                                                                                                    if (tamMedia != null) {
                                                                                                        String A19 = AbstractC166987dD.A19(tamMedia.A00);
                                                                                                        C137746Lw c137746Lw = C137756Lx.A03;
                                                                                                        UserSession userSession3 = l05.A01;
                                                                                                        EnumC132075xi enumC132075xi = EnumC132075xi.A0H;
                                                                                                        C42221xC A003 = C48433Lbm.A00(c137746Lw.A01(userSession3, enumC132075xi).A01, A19);
                                                                                                        if (AbstractC167007dF.A1X(A014.A0B, EnumC40111tc.A0a)) {
                                                                                                            A00 = C42221xC.A02(new JYF((InterfaceC16620sF) new C30495Dbe(A014, 33), 5), A003, C48433Lbm.A00(c137746Lw.A01(userSession3, enumC132075xi).A01, AbstractC166987dD.A19(tamMedia.A01)));
                                                                                                        } else {
                                                                                                            A00 = C48486Lcd.A00(A003, A014, l05, 9);
                                                                                                        }
                                                                                                        A0q.add(A00);
                                                                                                        AbstractC166997dE.A1W(A0q2, i2);
                                                                                                    } else {
                                                                                                        throw AbstractC166987dD.A14("media fields cannot be null");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (A0q.isEmpty()) {
                                                                                                A052 = C42221xC.A09(c47946LGa5);
                                                                                            } else {
                                                                                                A052 = C42221xC.A05(new C43597JQd(65, new C50268MHx(4, A0q2, c47946LGa5)), A0q);
                                                                                            }
                                                                                            JQn.A00(A052, c41761wQ, directVisualMessageViewerController, 62);
                                                                                        } else {
                                                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                                                        }
                                                                                    } else {
                                                                                        i++;
                                                                                    }
                                                                                } else {
                                                                                    int size3 = list.size();
                                                                                    int i3 = 0;
                                                                                    while (true) {
                                                                                        if (i3 < size3) {
                                                                                            C45093JxN A015 = c47946LGa4.A01(i3);
                                                                                            if (A015 != null && A015.A08 != null) {
                                                                                                L05 l052 = new L05(userSession);
                                                                                                directVisualMessageViewerController.A0J = l052;
                                                                                                C41761wQ c41761wQ2 = directVisualMessageViewerController.A0l;
                                                                                                C47946LGa c47946LGa6 = directVisualMessageViewerController.A0G;
                                                                                                if (c47946LGa6 != null) {
                                                                                                    List list3 = c47946LGa6.A03;
                                                                                                    ArrayList A0q3 = AbstractC25230BEn.A0q(list3);
                                                                                                    ArrayList A0q4 = AbstractC25230BEn.A0q(list3);
                                                                                                    int size4 = list3.size();
                                                                                                    for (int i4 = 0; i4 < size4; i4++) {
                                                                                                        C45093JxN A016 = c47946LGa6.A01(i4);
                                                                                                        if (A016 != null && A016.A08 != null) {
                                                                                                            DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = A016.A08;
                                                                                                            if (remixMedia != null) {
                                                                                                                File A004 = AbstractC47007KqQ.A00(l052.A01).A00(AbstractC166987dD.A19(remixMedia.A00));
                                                                                                                if (A004 == null || (str2 = A004.getCanonicalPath()) == null) {
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                C42221xC A09 = C42221xC.A09(str2);
                                                                                                                boolean A1X = AbstractC167007dF.A1X(A016.A0B, EnumC40111tc.A0a);
                                                                                                                C42221xC A092 = C42221xC.A09(AbstractC166987dD.A19(remixMedia.A01));
                                                                                                                int i5 = 35;
                                                                                                                if (A1X) {
                                                                                                                    i5 = 34;
                                                                                                                }
                                                                                                                A0q3.add(C42221xC.A02(new JYF((InterfaceC16620sF) new C30495Dbe(A016, i5), 5), A09, A092));
                                                                                                                AbstractC166997dE.A1W(A0q4, i4);
                                                                                                            } else {
                                                                                                                throw AbstractC166987dD.A14("media fields cannot be null");
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (A0q3.isEmpty()) {
                                                                                                        A05 = C42221xC.A09(c47946LGa6);
                                                                                                    } else {
                                                                                                        A05 = C42221xC.A05(new C43597JQd(65, new C50268MHx(3, A0q4, c47946LGa6)), A0q3);
                                                                                                    }
                                                                                                    JQn.A00(A05, c41761wQ2, directVisualMessageViewerController, 61);
                                                                                                } else {
                                                                                                    throw AbstractC166987dD.A14("Required value was null.");
                                                                                                }
                                                                                            } else {
                                                                                                i3++;
                                                                                            }
                                                                                        } else {
                                                                                            DirectVisualMessageViewerController.A0E(directVisualMessageViewerController);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                                        }
                                                                    }
                                                                    if (z3 && directVisualMessageViewerController.A0J != null && (c47946LGa = directVisualMessageViewerController.A0G) != null) {
                                                                        C17u A0C = C17s.A0C(0, c47946LGa.A03.size());
                                                                        if ((A0C instanceof Collection) && ((Collection) A0C).isEmpty()) {
                                                                            return;
                                                                        }
                                                                        Iterator it = A0C.iterator();
                                                                        while (it.hasNext()) {
                                                                            C45093JxN A017 = c47946LGa.A01(((AbstractC16880sg) it).A00());
                                                                            if (A017 != null && (privacyMediaOverlayViewModel = A017.A00) != null && privacyMediaOverlayViewModel.A00 == 1) {
                                                                                C137756Lx A005 = C137746Lw.A00(userSession, __redex_internal_original_name);
                                                                                C137766Ly c137766Ly = A005.A01;
                                                                                C41761wQ c41761wQ3 = directVisualMessageViewerController.A0l;
                                                                                C42221xC A006 = C137766Ly.A00(c137766Ly);
                                                                                C48494Lcl c48494Lcl = C48494Lcl.A00;
                                                                                C14360o3.A0C(c48494Lcl, "null cannot be cast to non-null type com.instagram.common.rx.Predicate<kotlin.collections.Set<kotlin.String?>>");
                                                                                JQn.A00(A006.A0M(c48494Lcl).A0J(new C48358LaY(8, A005, directVisualMessageViewerController)), c41761wQ3, directVisualMessageViewerController, 63);
                                                                                return;
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                throw AbstractC166987dD.A14("Required value was null.");
                                                            }
                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                        }
                                                        throw AbstractC166987dD.A14("Required value was null.");
                                                    }
                                                    throw AbstractC166987dD.A14("Required value was null.");
                                                }
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this;
    }

    @Override // X.InterfaceC1119353f
    public final void EK1() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            C71058WnD c71058WnD = directVisualMessageViewerController.A0H;
            if (c71058WnD != null) {
                c71058WnD.A00();
                C71058WnD c71058WnD2 = directVisualMessageViewerController.A0H;
                if (c71058WnD2 != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout != null) {
                        AbstractC148046la.A00(touchInterceptorFrameLayout, c71058WnD2);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0F("directMediaViewerGestureController");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            directVisualMessageViewerController.onBackPressed();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        return (TouchInterceptorFrameLayout) AbstractC166997dE.A0R(requireView(), R.id.direct_visual_message_viewer_root_container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0175, code lost:
    
        if (r0 != 3) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r87) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCV.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int A02 = C0f9.A02(521685194);
        C14360o3.A0B(layoutInflater, 0);
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_direct_visual_message_viewer, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
            directVisualMessageViewerController.viewerContainer = (TouchInterceptorFrameLayout) inflate;
            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
            Window window = fragmentActivity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                C14360o3.A07(decorView);
                directVisualMessageViewerController.reelViewerShadowAnimator = new L22(decorView);
                int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width) / 2;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                if (touchInterceptorFrameLayout != null) {
                    C71058WnD c71058WnD = new C71058WnD(touchInterceptorFrameLayout, new C49332LrQ(directVisualMessageViewerController, dimensionPixelSize), 0.75f);
                    directVisualMessageViewerController.A0H = c71058WnD;
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout2 != null) {
                        AbstractC148046la.A00(touchInterceptorFrameLayout2, c71058WnD);
                        TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = directVisualMessageViewerController.viewerContainer;
                        if (touchInterceptorFrameLayout3 != null) {
                            touchInterceptorFrameLayout3.requestFocus();
                        }
                        TouchInterceptorFrameLayout touchInterceptorFrameLayout4 = directVisualMessageViewerController.viewerContainer;
                        if (touchInterceptorFrameLayout4 != null) {
                            touchInterceptorFrameLayout4.setOnKeyListener(directVisualMessageViewerController);
                        }
                        view = directVisualMessageViewerController.viewerContainer;
                        if (view == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            view = new View(layoutInflater.getContext());
        }
        C0f9.A09(146073433, A02);
        return view;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1828379056);
        super.onDestroy();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
            C64352vu c64352vu = directVisualMessageViewerController.A0K;
            if (c64352vu == null) {
                C14360o3.A0F("impressionTracker");
                throw C00O.createAndThrow();
            }
            abstractC59962oe.unregisterLifecycleListener(c64352vu);
        }
        C0f9.A09(-894720477, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C5TA c5ta;
        IgProgressImageView igProgressImageView;
        IgProgressImageView igProgressImageView2;
        int A02 = C0f9.A02(-1937893490);
        super.onDestroyView();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            C3I9 c3i9 = directVisualMessageViewerController.keyboardHeightChangeDetector;
            if (c3i9 != null) {
                c3i9.EFx(directVisualMessageViewerController);
            }
            C71058WnD c71058WnD = directVisualMessageViewerController.A0H;
            if (c71058WnD == null) {
                C14360o3.A0F("directMediaViewerGestureController");
                throw C00O.createAndThrow();
            }
            c71058WnD.destroy();
            L5Y l5y = directVisualMessageViewerController.contentHolder;
            if (l5y != null && (igProgressImageView2 = l5y.A0J) != null) {
                igProgressImageView2.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
            }
            L5Y l5y2 = directVisualMessageViewerController.contentHolder;
            if (l5y2 != null && (igProgressImageView = l5y2.A0J) != null) {
                igProgressImageView.A06(R.id.listener_id_for_direct_visual_message_item_viewer_image_binding);
            }
            C43931Jbg c43931Jbg = directVisualMessageViewerController.A0C;
            if (c43931Jbg != null) {
                c43931Jbg.A01 = null;
                c43931Jbg.A00 = null;
                c43931Jbg.A02 = null;
            }
            directVisualMessageViewerController.A0C = null;
            CircularImageView circularImageView = directVisualMessageViewerController.A0A;
            if (circularImageView != null) {
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le.A00(circularImageView).A0G();
                View view = directVisualMessageViewerController.contentView;
                if (view != null) {
                    AbstractC125325le.A00(view).A0G();
                    C147326kI c147326kI = directVisualMessageViewerController.photoTimerController;
                    if (c147326kI != null) {
                        c147326kI.A02();
                    }
                    C49685LxG c49685LxG = directVisualMessageViewerController.videoPlayer;
                    if (c49685LxG != null && (c5ta = c49685LxG.A05) != null) {
                        c5ta.A0A("fragment_paused");
                        c49685LxG.A05 = null;
                    }
                    directVisualMessageViewerController.A0s.A00 = null;
                    DirectVisualMessageViewerControllerLifecycleUtil.cleanupReferences(directVisualMessageViewerController);
                    FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                    Window window = fragmentActivity.getWindow();
                    C14360o3.A07(window);
                    AbstractC56402iY.A07(AbstractC43592JPx.A08(fragmentActivity), window, true);
                    L05 l05 = directVisualMessageViewerController.A0J;
                    if (l05 != null) {
                        l05.A00.A01();
                    }
                    directVisualMessageViewerController.A0l.A01();
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C0f9.A09(65631087, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        String str2;
        int A02 = C0f9.A02(-1984695803);
        super.onPause();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            L5M l5m = directVisualMessageViewerController.A0B;
            if (l5m == null) {
                str2 = "directVisualViewerSummaryLogger";
            } else {
                C19280xC A00 = C19280xC.A00(directVisualMessageViewerController.A0v, "direct_story_session_summary");
                A00.A0C("viewer_session_id", l5m.A0A);
                A00.A08(Integer.valueOf(l5m.A02), "photos_consumed");
                A00.A08(Integer.valueOf(l5m.A04), "videos_consumed");
                A00.A0D("reel_session_consumption_list", l5m.A0B);
                if (l5m.A0C) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                A00.A0C("is_replay", str);
                A00.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, l5m.A09);
                A00.A08(Integer.valueOf(l5m.A06), "reel_size");
                A00.A0A(AbstractC111324zv.A00(1340), AbstractC37302Gc3.A0S(SystemClock.elapsedRealtime() - l5m.A07));
                A00.A08(Integer.valueOf(l5m.A05), "one_view_consumed");
                A00.A08(Integer.valueOf(l5m.A03), "replayable_consumed");
                A00.A08(Integer.valueOf(l5m.A01), "permanent_consumed");
                A00.A0A("pause_duration", Double.valueOf(l5m.A00));
                AbstractC31173DnH.A1S(A00, l5m.A08);
                directVisualMessageViewerController.A0W("fragment_paused");
                C3MT c3mt = directVisualMessageViewerController.A09;
                str2 = "screenshotDetector";
                if (c3mt != null) {
                    C3MJ c3mj = directVisualMessageViewerController.A07;
                    if (c3mj != null) {
                        c3mj.A06(c3mt);
                        directVisualMessageViewerController.A09 = null;
                    }
                }
                C3MJ c3mj2 = directVisualMessageViewerController.A07;
                if (c3mj2 != null) {
                    c3mj2.A04();
                    C43931Jbg c43931Jbg = directVisualMessageViewerController.A0C;
                    if (c43931Jbg != null) {
                        c43931Jbg.A01 = null;
                        c43931Jbg.A00 = null;
                        c43931Jbg.A02 = null;
                    }
                    UserSession userSession = directVisualMessageViewerController.A0m;
                    C25671My A002 = AbstractC25651Mw.A00(userSession);
                    A002.A02(directVisualMessageViewerController.A0i, C48042Ir.class);
                    A002.A02(directVisualMessageViewerController.A0j, C3IL.class);
                    A002.A02(directVisualMessageViewerController.A0k, C2Io.class);
                    C3I9 c3i9 = directVisualMessageViewerController.keyboardHeightChangeDetector;
                    if (c3i9 != null) {
                        c3i9.onStop();
                    }
                    C148536mO c148536mO = directVisualMessageViewerController.A0M;
                    if (c148536mO == null) {
                        str2 = "reelInteractiveController";
                    } else {
                        c148536mO.A03(null, false, true);
                        EditText editText = directVisualMessageViewerController.composerEditText;
                        if (editText != null) {
                            editText.removeTextChangedListener(directVisualMessageViewerController.composerTextWatcher);
                        }
                        EditText editText2 = directVisualMessageViewerController.composerEditText;
                        if (editText2 != null) {
                            editText2.setOnFocusChangeListener(null);
                        }
                        if (!directVisualMessageViewerController.A0U) {
                            boolean z = true;
                            if (directVisualMessageViewerController.A0c == 1) {
                                z = false;
                            }
                            DirectVisualMessageViewerController.A0L(directVisualMessageViewerController, 9, z);
                        }
                        C149176nR c149176nR = directVisualMessageViewerController.A0O;
                        if (c149176nR == null) {
                            str2 = "appAttributionTooltipHelper";
                        } else {
                            c149176nR.A01 = null;
                            C47677L3k c47677L3k = directVisualMessageViewerController.A0N;
                            if (c47677L3k == null) {
                                str2 = "pollTooltipHelper";
                            } else {
                                c47677L3k.A00 = null;
                                C42411xV A003 = C42411xV.A00(userSession);
                                AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
                                A003.A08(abstractC59962oe.getModuleName());
                                AbstractC42951yN.A00(userSession).A04(abstractC59962oe.getModuleName());
                                C42411xV.A00(userSession);
                                C11T.A00();
                                C11T.A00();
                                directVisualMessageViewerController.A0S = false;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1681774056, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        String str2;
        View findViewById;
        int A02 = C0f9.A02(2065144196);
        super.onResume();
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController != null) {
            View view = directVisualMessageViewerController.itemView;
            if (view != null && (findViewById = view.findViewById(R.id.viewer_media_view_container)) != null) {
                findViewById.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC44250Jgu(directVisualMessageViewerController, 2));
            }
            directVisualMessageViewerController.A0U = false;
            C71058WnD c71058WnD = directVisualMessageViewerController.A0H;
            String str3 = "directMediaViewerGestureController";
            if (c71058WnD != null) {
                c71058WnD.A00();
                C71058WnD c71058WnD2 = directVisualMessageViewerController.A0H;
                if (c71058WnD2 != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
                    if (touchInterceptorFrameLayout != null) {
                        AbstractC148046la.A00(touchInterceptorFrameLayout, c71058WnD2);
                        L5M l5m = directVisualMessageViewerController.A0B;
                        if (l5m == null) {
                            str3 = "directVisualViewerSummaryLogger";
                        } else {
                            l5m.A07 = SystemClock.elapsedRealtime();
                            FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                            Window window = fragmentActivity.getWindow();
                            C14360o3.A07(window);
                            AbstractC56402iY.A07(AbstractC43592JPx.A08(fragmentActivity), window, false);
                            if (directVisualMessageViewerController.A0R) {
                                directVisualMessageViewerController.A0X("resume");
                            }
                            C3MJ c3mj = directVisualMessageViewerController.A07;
                            str3 = "screenshotDetector";
                            if (c3mj != null) {
                                c3mj.A03();
                                C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
                                if (c47946LGa != null) {
                                    if (directVisualMessageViewerController.A09 == null && !C14360o3.A0K(c47946LGa.A00().A0N, "permanent")) {
                                        if (directVisualMessageViewerController.A07 != null) {
                                            C3MT A00 = C3MJ.A00(new C48500Lcr(directVisualMessageViewerController.A0m, directVisualMessageViewerController.A0o, directVisualMessageViewerController.A0x, c47946LGa.A00().A01(), c47946LGa.A00().A0G, c47946LGa.A00().A0M, c47946LGa.A00().A0X));
                                            directVisualMessageViewerController.A09 = A00;
                                            C3MJ c3mj2 = directVisualMessageViewerController.A07;
                                            if (c3mj2 != null) {
                                                c3mj2.A05(A00);
                                            }
                                        }
                                    }
                                    List list = c47946LGa.A03;
                                    int size = list.size();
                                    int i = c47946LGa.A01;
                                    if (size < i) {
                                        UserSession userSession = directVisualMessageViewerController.A0m;
                                        C2DS A002 = AbstractC28761aE.A00(userSession);
                                        DirectThreadKey A01 = JRE.A01(directVisualMessageViewerController.A0x);
                                        if (list.isEmpty()) {
                                            str2 = null;
                                        } else {
                                            str2 = ((C45093JxN) list.get(AbstractC25226BEj.A05(list))).A0K;
                                        }
                                        List CCz = A002.CCz(A01, str2);
                                        if (CCz != null) {
                                            C2EC c2ec = directVisualMessageViewerController.A0n;
                                            if (c2ec != null) {
                                                ArrayList A04 = AbstractC101604hV.A04(fragmentActivity, userSession, c2ec, CCz);
                                                int size2 = i - list.size();
                                                if (size2 > 0) {
                                                    list.addAll(A04.subList(0, Math.min(size2, A04.size())));
                                                }
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        }
                                    }
                                    UserSession userSession2 = directVisualMessageViewerController.A0m;
                                    C25671My A003 = AbstractC25651Mw.A00(userSession2);
                                    A003.A01(directVisualMessageViewerController.A0i, C48042Ir.class);
                                    A003.A01(directVisualMessageViewerController.A0j, C3IL.class);
                                    A003.A01(directVisualMessageViewerController.A0k, C2Io.class);
                                    C3I9 c3i9 = directVisualMessageViewerController.keyboardHeightChangeDetector;
                                    if (c3i9 != null) {
                                        c3i9.Dnr(fragmentActivity);
                                    }
                                    EditText editText = directVisualMessageViewerController.composerEditText;
                                    if (editText != null) {
                                        editText.addTextChangedListener(directVisualMessageViewerController.composerTextWatcher);
                                    }
                                    EditText editText2 = directVisualMessageViewerController.composerEditText;
                                    if (editText2 != null) {
                                        editText2.setOnFocusChangeListener(new LQ3(directVisualMessageViewerController, 4));
                                    }
                                    C3o9 c3o9 = directVisualMessageViewerController.A0x;
                                    if (c3o9 instanceof DirectThreadKey) {
                                        C1WZ A004 = C3J1.A00();
                                        String str4 = userSession2.userId;
                                        DirectThreadKey A022 = JRE.A02(c3o9);
                                        if (A022 != null) {
                                            str = A022.A00;
                                        } else {
                                            str = null;
                                        }
                                        A004.A02.A04(userSession2, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(str4, str, null));
                                    }
                                    C149176nR c149176nR = directVisualMessageViewerController.A0O;
                                    if (c149176nR == null) {
                                        str3 = "appAttributionTooltipHelper";
                                    } else {
                                        c149176nR.A01 = directVisualMessageViewerController.A10;
                                        C47677L3k c47677L3k = directVisualMessageViewerController.A0N;
                                        if (c47677L3k == null) {
                                            str3 = "pollTooltipHelper";
                                        } else {
                                            c47677L3k.A00 = directVisualMessageViewerController.A0t;
                                            AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
                                            C3AX c3ax = new C3AX(userSession2, null, abstractC59962oe.getModuleName());
                                            C3AR c3ar = new C3AR(userSession2, abstractC59962oe.getModuleName());
                                            C42411xV A005 = C42411xV.A00(userSession2);
                                            String moduleName = abstractC59962oe.getModuleName();
                                            C14360o3.A08(C42411xV.A0F);
                                            A005.A07(c3ar, c3ax, moduleName);
                                            C42411xV.A00(userSession2);
                                            C11T.A00();
                                            C11T.A00();
                                            C30D.A06(fragmentActivity, false);
                                        }
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        C0f9.A09(932675144, A02);
    }
}
