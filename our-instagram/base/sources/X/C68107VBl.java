package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.VBl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68107VBl extends V1T implements InterfaceC77483dY, InterfaceC58093PpI {
    public static final String __redex_internal_original_name = "SelfRemediationBottomSheetFragmentImpl";
    public float A00;
    public int A01;
    public C189478aR A02;
    public User A03;
    public C67911V2b A04;
    public VgT A05;
    public InterfaceC71987XDy A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final String A0B = AbstractC111324zv.A00(833);

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC58093PpI
    public final void DkT(VDA vda) {
        int ordinal = vda.ordinal();
        String str = "commenterUser";
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        if (ordinal == 1) {
                            InterfaceC71987XDy interfaceC71987XDy = this.A06;
                            if (interfaceC71987XDy != null) {
                                interfaceC71987XDy.Czj();
                            }
                            if (this.A05 != null) {
                                if (this.A03 != null) {
                                    return;
                                }
                                C14360o3.A0F(str);
                            }
                            C14360o3.A0F("reportingLogger");
                        } else {
                            return;
                        }
                    } else {
                        InterfaceC71987XDy interfaceC71987XDy2 = this.A06;
                        if (interfaceC71987XDy2 != null) {
                            interfaceC71987XDy2.Dwj();
                        }
                        if (!this.A09) {
                            AbstractC35261Fgv.A03(getActivity());
                            return;
                        }
                        return;
                    }
                } else {
                    InterfaceC71987XDy interfaceC71987XDy3 = this.A06;
                    if (interfaceC71987XDy3 != null) {
                        interfaceC71987XDy3.Dgv();
                        return;
                    }
                    return;
                }
            } else {
                if (this.A05 != null) {
                    if (this.A03 != null) {
                        C189478aR c189478aR = this.A02;
                        if (c189478aR != null) {
                            InterfaceC09390do interfaceC09390do = this.A0C;
                            C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                            Resources A0N = AbstractC166997dE.A0N(this);
                            User user = this.A03;
                            if (user != null) {
                                A0g.A0d = AbstractC166997dE.A0r(A0N, user.getUsername(), 2131973265);
                                AbstractC25225BEi.A1Q(A0g, this.A08);
                                A0g.A03 = this.A00;
                                UserSession userSession = (UserSession) interfaceC09390do.getValue();
                                User user2 = this.A03;
                                if (user2 != null) {
                                    c189478aR.A0F(AbstractC35261Fgv.A00(userSession, user2, new VBU(), "comment_thread"), A0g);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                }
                C14360o3.A0F("reportingLogger");
            }
        } else {
            if (this.A05 != null) {
                if (this.A03 != null) {
                    FragmentActivity requireActivity = requireActivity();
                    UserSession userSession2 = (UserSession) this.A0C.getValue();
                    User user3 = this.A03;
                    if (user3 != null) {
                        String str2 = this.A0B;
                        String str3 = this.A07;
                        if (str3 == null) {
                            str = "commentId";
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                            jSONObject.put("comment_id", str3);
                            AbstractC35261Fgv.A04(requireActivity, userSession2, this, user3, AbstractC111324zv.A00(833), str2, jSONObject, this.A09);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
            }
            C14360o3.A0F("reportingLogger");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return (AbstractC12990ll) this.A0C.getValue();
    }

    @Override // X.InterfaceC58093PpI
    public final void DkS(VDA vda) {
        String str;
        if (this.A05 == null) {
            str = "reportingLogger";
        } else if (this.A03 == null) {
            str = "commenterUser";
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        VDQ vdq;
        int i;
        int A02 = C0f9.A02(-2041001204);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = 480206963;
        } else {
            Bundle requireArguments = requireArguments();
            InterfaceC09390do interfaceC09390do = this.A0C;
            this.A05 = AbstractC69993VzD.A00((UserSession) interfaceC09390do.getValue(), requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD"));
            this.A08 = requireArguments.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = requireArguments.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            String string = requireArguments.getString("SelfRemediationBottomSheetFragment.ARG_COMMENT_ID");
            AbstractC153636vY.A03(requireArguments, string, "SelfRemediationBottomSheetFragment.ARG_COMMENT_ID");
            this.A07 = string;
            String string2 = requireArguments.getString("SelfRemediationBottomSheetFragment.COMMENTER_USER_ID");
            AbstractC153636vY.A03(requireArguments, string2, "SelfRemediationBottomSheetFragment.COMMENTER_USER_ID");
            User A022 = AnonymousClass189.A00((UserSession) interfaceC09390do.getValue()).A02(string2);
            if (A022 != null) {
                this.A03 = A022;
                this.A01 = requireArguments.getInt("SelfRemediationBottomSheetFragment.AGR_COMMENT_HOST_SURFACE_TYPE");
                this.A0A = requireArguments.getBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", false);
                this.A09 = requireArguments.getBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", false);
                User user = this.A03;
                String str = "commenterUser";
                if (user != null) {
                    if (user.B7L() == FollowStatus.A08) {
                        C129885ts A00 = AbstractC129875tr.A00((UserSession) interfaceC09390do.getValue());
                        User user2 = this.A03;
                        if (user2 != null) {
                            A00.A0G(user2, false);
                        }
                    }
                    Context requireContext = requireContext();
                    UserSession userSession = (UserSession) interfaceC09390do.getValue();
                    User user3 = this.A03;
                    if (user3 != null) {
                        C67911V2b c67911V2b = new C67911V2b(requireContext, userSession, user3, this, this, this.A01, this.A0A);
                        this.A04 = c67911V2b;
                        A0U(c67911V2b);
                        C67911V2b c67911V2b2 = this.A04;
                        if (c67911V2b2 == null) {
                            str = "adapter";
                        } else {
                            c67911V2b2.A06();
                            if (c67911V2b2.A00 == 8) {
                                vdq = VDQ.A04;
                            } else {
                                vdq = VDQ.A03;
                            }
                            c67911V2b2.A08(c67911V2b2.A02, vdq);
                            C51759Mti c51759Mti = new C51759Mti(c67911V2b2.A01, EnumC53205Ng3.A03);
                            VDA vda = VDA.A03;
                            N9I n9i = c67911V2b2.A03;
                            c67911V2b2.A09(n9i, c51759Mti, vda);
                            if (c67911V2b2.A04) {
                                c67911V2b2.A09(n9i, c51759Mti, VDA.A06);
                                c67911V2b2.A09(n9i, c51759Mti, VDA.A08);
                            }
                            c67911V2b2.A09(n9i, c51759Mti, VDA.A07);
                            c67911V2b2.A09(n9i, c51759Mti, VDA.A02);
                            c67911V2b2.A07();
                            if (this.A05 == null) {
                                str = "reportingLogger";
                            } else if (this.A07 == null) {
                                str = "commentId";
                            } else if (this.A03 != null) {
                                i = -1045767211;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
        C0f9.A09(i, A02);
    }
}
