package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.user.model.User;

/* renamed from: X.ASw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23261ASw implements View.OnFocusChangeListener, InterfaceC195198kL {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public EditText A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public CircularImageView A0B;
    public InterfaceC56392iX A0C;
    public AvatarView A0D;
    public C221539qI A0E;
    public User A0F;
    public Integer A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public String A0L;
    public int[] A0M;
    public final Context A0N;
    public final View A0O;
    public final ViewStub A0P;
    public final UserSession A0Q;
    public final C8NW A0R;
    public final C88W A0S;
    public final Rect A0T;
    public final InterfaceC1810081c A0U;

    public ViewOnFocusChangeListenerC23261ASw(View view, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NW c8nw) {
        this.A0Q = userSession;
        this.A0U = interfaceC1810081c;
        this.A0R = c8nw;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0N = A0L;
        this.A0S = new C88W(A0L, c3i9, this);
        this.A0O = AbstractC166987dD.A0c(view, R.id.text_overlay_edit_text_container);
        this.A0P = (ViewStub) AbstractC166987dD.A0c(view, R.id.smb_support_sticker_editor_stub);
        this.A0T = AbstractC166987dD.A0U();
        this.A0M = new int[2];
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        if (z) {
            this.A0S.A00();
            AbstractC13880nE.A0S(view);
            return;
        }
        EditText editText = this.A05;
        if (editText != null) {
            if (editText.hasFocus()) {
                return;
            }
            TextView textView = this.A07;
            if (textView != null) {
                if (textView.hasFocus()) {
                    return;
                }
                this.A0S.A01();
                AbstractC13880nE.A0O(view);
                A01();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final C41629IbK A00(ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw) {
        EditText editText = viewOnFocusChangeListenerC23261ASw.A05;
        if (editText != null) {
            String A0g = AbstractC167007dF.A0g(editText);
            int length = A0g.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A19 = AbstractC167027dH.A19(A0g, i2);
                if (!z) {
                    if (!A19) {
                        z = true;
                    } else {
                        i++;
                    }
                } else {
                    if (!A19) {
                        break;
                    }
                    length--;
                }
            }
            String obj = A0g.subSequence(i, length + 1).toString();
            if (obj == null || obj.length() == 0) {
                obj = viewOnFocusChangeListenerC23261ASw.A0L;
            }
            int i3 = viewOnFocusChangeListenerC23261ASw.A0I;
            int[] iArr = viewOnFocusChangeListenerC23261ASw.A0M;
            Integer valueOf = Integer.valueOf(iArr[0]);
            Integer valueOf2 = Integer.valueOf(iArr[1]);
            EnumC209229Ne enumC209229Ne = EnumC209229Ne.A0H;
            if (AbstractC209259Nh.A01(enumC209229Ne, valueOf, valueOf2) == C41629IbK.A03) {
                i3 = -13068304;
            }
            User user = viewOnFocusChangeListenerC23261ASw.A0F;
            if (user != null) {
                Integer num = viewOnFocusChangeListenerC23261ASw.A0G;
                if (num != null) {
                    EnumC209229Ne enumC209229Ne2 = EnumC209229Ne.A07;
                    if (num == C05F.A01) {
                        enumC209229Ne2 = EnumC209229Ne.A0A;
                    }
                    if (num == C05F.A0C) {
                        enumC209229Ne2 = enumC209229Ne;
                    }
                    AbstractC209259Nh.A02(enumC209229Ne2);
                    if (obj != null) {
                        int i4 = viewOnFocusChangeListenerC23261ASw.A0J;
                        int[] iArr2 = viewOnFocusChangeListenerC23261ASw.A0M;
                        int i5 = iArr2[0];
                        int i6 = iArr2[1];
                        int i7 = viewOnFocusChangeListenerC23261ASw.A0K;
                        int i8 = viewOnFocusChangeListenerC23261ASw.A01;
                        User user2 = viewOnFocusChangeListenerC23261ASw.A0F;
                        if (user2 != null) {
                            Integer num2 = viewOnFocusChangeListenerC23261ASw.A0G;
                            if (num2 != null) {
                                String A01 = AEO.A01(user2, num2);
                                Context context = viewOnFocusChangeListenerC23261ASw.A0N;
                                Integer num3 = viewOnFocusChangeListenerC23261ASw.A0G;
                                if (num3 != null) {
                                    return new C41629IbK(user, num, AEO.A00(context, num3), A01, obj, i3, i6, i8, i5, i4, i7, viewOnFocusChangeListenerC23261ASw.A0H);
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

    private final void A01() {
        View view;
        if (this.A04 != null) {
            C150956qv.A08(new View[]{this.A0O, this.A03}, false);
            C221539qI c221539qI = this.A0E;
            if (c221539qI != null) {
                c221539qI.A01("");
                EditText editText = this.A05;
                if (editText != null) {
                    if (editText.hasFocus()) {
                        view = this.A05;
                        if (view == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        TextView textView = this.A07;
                        if (textView != null) {
                            if (textView.hasFocus()) {
                                view = this.A07;
                                if (view == null) {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                return;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    view.clearFocus();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A02(ViewOnFocusChangeListenerC23261ASw viewOnFocusChangeListenerC23261ASw, EnumC209229Ne enumC209229Ne) {
        EnumC209229Ne enumC209229Ne2;
        if (enumC209229Ne == C41629IbK.A02) {
            viewOnFocusChangeListenerC23261ASw.A0K = -16777216;
            viewOnFocusChangeListenerC23261ASw.A0J = -6710887;
            viewOnFocusChangeListenerC23261ASw.A0I = -1;
            InterfaceC56392iX interfaceC56392iX = viewOnFocusChangeListenerC23261ASw.A0C;
            if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(8);
                TextView textView = viewOnFocusChangeListenerC23261ASw.A07;
                if (textView != null) {
                    textView.setBackground(viewOnFocusChangeListenerC23261ASw.A0N.getDrawable(R.drawable.fundraiser_white_sticker_donate_button_background));
                    enumC209229Ne2 = EnumC209229Ne.A0C;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            viewOnFocusChangeListenerC23261ASw.A0K = -1;
            viewOnFocusChangeListenerC23261ASw.A0J = -855638017;
            viewOnFocusChangeListenerC23261ASw.A0I = AbstractC209259Nh.A00(enumC209229Ne);
            InterfaceC56392iX interfaceC56392iX2 = viewOnFocusChangeListenerC23261ASw.A0C;
            if (interfaceC56392iX2 != null) {
                interfaceC56392iX2.setVisibility(8);
                TextView textView2 = viewOnFocusChangeListenerC23261ASw.A07;
                if (textView2 != null) {
                    textView2.setBackground(viewOnFocusChangeListenerC23261ASw.A0N.getDrawable(R.drawable.smb_support_sticker_cta_background));
                    enumC209229Ne2 = enumC209229Ne;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        viewOnFocusChangeListenerC23261ASw.A0M = AbstractC209259Nh.A02(enumC209229Ne);
        View view = viewOnFocusChangeListenerC23261ASw.A02;
        if (view != null) {
            Drawable mutate = view.getBackground().mutate();
            C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColors(viewOnFocusChangeListenerC23261ASw.A0M);
            CircularImageView circularImageView = viewOnFocusChangeListenerC23261ASw.A0B;
            if (circularImageView != null) {
                Drawable mutate2 = circularImageView.getBackground().mutate();
                C14360o3.A0C(mutate2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) mutate2).setColors(AbstractC209259Nh.A02(enumC209229Ne2));
                EditText editText = viewOnFocusChangeListenerC23261ASw.A05;
                if (editText != null) {
                    editText.setTextColor(viewOnFocusChangeListenerC23261ASw.A0K);
                    EditText editText2 = viewOnFocusChangeListenerC23261ASw.A05;
                    if (editText2 != null) {
                        editText2.setHintTextColor(AbstractC13950nL.A07(viewOnFocusChangeListenerC23261ASw.A0K, 0.6f));
                        TextView textView3 = viewOnFocusChangeListenerC23261ASw.A0A;
                        if (textView3 != null) {
                            textView3.setTextColor(viewOnFocusChangeListenerC23261ASw.A0J);
                            TextView textView4 = viewOnFocusChangeListenerC23261ASw.A07;
                            if (textView4 != null) {
                                textView4.setTextColor(viewOnFocusChangeListenerC23261ASw.A0I);
                                ImageView imageView = viewOnFocusChangeListenerC23261ASw.A06;
                                if (imageView != null) {
                                    imageView.setColorFilter(C3DY.A00(AbstractC209259Nh.A00(enumC209229Ne)));
                                    CircularImageView circularImageView2 = viewOnFocusChangeListenerC23261ASw.A0B;
                                    if (circularImageView2 != null) {
                                        circularImageView2.setColorFilter(C3DY.A00(-1));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Ux, java.lang.Object] */
    public final void A04(boolean z) {
        C148276lx c148276lx;
        C8NW c8nw = this.A0R;
        C41629IbK A00 = A00(this);
        if (!z) {
            C220879pB c220879pB = new C220879pB(c8nw.A0f);
            c220879pB.A0B(A00);
            C23108AGw A15 = c8nw.A15();
            if (C05F.A00 == A00.A01()) {
                c220879pB.A01 = "smb_support_sticker_gift_card";
                c148276lx = C148276lx.A1S;
            } else if (C05F.A01 == A00.A01()) {
                c220879pB.A01 = "smb_support_sticker_food_delivery";
                c148276lx = C148276lx.A1Q;
            } else if (C05F.A0C == A00.A01()) {
                c220879pB.A01 = "smb_support_sticker_get_quote";
                c148276lx = C148276lx.A1R;
            }
            c8nw.A1J(c220879pB, new C8FC(A15), c148276lx.A01());
        } else {
            InterfaceC1810081c interfaceC1810081c = c8nw.A1A;
            ?? obj = new Object();
            obj.A00 = false;
            interfaceC1810081c.E4u(obj);
            C8NW.A0Z(c8nw, C220879pB.class);
        }
        c8nw.A1M(C05F.A01);
        c8nw.A0z.Doh(C148276lx.A1Q.A0Z);
        EditText editText = this.A05;
        if (editText != null) {
            editText.removeTextChangedListener(this.A0E);
            A01();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        InterfaceC1810081c.A00(this.A0U);
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        if (this.A0G == C05F.A0C) {
            this.A0O.getGlobalVisibleRect(this.A0T);
            TextView textView = this.A09;
            if (textView != null) {
                textView.setTranslationY(i2 - r0.bottom);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.ViewOnFocusChangeListenerC23261ASw r10, X.C41629IbK r11) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC23261ASw.A03(X.ASw, X.IbK):void");
    }
}
