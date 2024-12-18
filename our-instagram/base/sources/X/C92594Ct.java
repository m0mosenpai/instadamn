package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.4Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92594Ct {
    public static final C92594Ct A00 = new Object();

    public static final Drawable A00(Context context, Integer num, int i) {
        int i2;
        int intValue = num.intValue();
        if (intValue != 0) {
            int i3 = R.attr.igds_color_icon_on_white;
            if (intValue != 1) {
                i3 = R.attr.igds_color_secondary_text_on_media;
            }
            i2 = AbstractC53242c7.A0H(context, i3);
        } else {
            i2 = R.color.audio_bar_action_color_enabled;
        }
        Drawable A01 = AbstractC85953sP.A01(context, i, i2);
        if (A01 != null) {
            return A01;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, C92584Cs c92584Cs) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c92584Cs, 2);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return C92604Cu.A03(resources, C92604Cu.A01(context, c92584Cs), C92604Cu.A00(context, c92584Cs), userSession, c92584Cs, true);
    }

    public static final C25317BIm A02(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C92584Cs c92584Cs, Integer num) {
        Drawable drawable;
        int i;
        Object obj;
        C14360o3.A0B(spannableStringBuilder, 1);
        C14360o3.A0B(c92584Cs, 2);
        C14360o3.A0B(userSession, 3);
        if (!c92584Cs.A05 && !c92584Cs.A08) {
            if (c92584Cs.A0A) {
                drawable = A00(context, num, R.drawable.clips_trending_arrow);
            } else if (c92584Cs.A06 && AbstractC185298Jv.A02(userSession)) {
                drawable = A00.A07(context, num);
            } else {
                C206239Bg c206239Bg = c92584Cs.A01;
                if (c206239Bg != null) {
                    obj = c206239Bg.A03;
                } else {
                    obj = null;
                }
                OriginalAudioSubtype originalAudioSubtype = OriginalAudioSubtype.A06;
                if (obj == originalAudioSubtype) {
                    if (c206239Bg != null && c206239Bg.A03 == originalAudioSubtype && C18U.A06(C06090Tz.A05, userSession, 36321353011504468L)) {
                        int dimension = (int) context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
                        Bitmap A002 = AbstractC27488CBj.A00(A00(context, num, R.drawable.instagram_multi_track_pano_filled_24), dimension, dimension);
                        Resources resources = context.getResources();
                        C14360o3.A07(resources);
                        drawable = new BitmapDrawable(resources, A002);
                    } else {
                        drawable = A00(context, num, R.drawable.instagram_mix_pano_filled_12);
                    }
                } else {
                    drawable = A00(context, num, R.drawable.instagram_music_pano_filled_12);
                }
            }
        } else {
            drawable = null;
        }
        int i2 = c92584Cs.A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            int i3 = R.attr.igds_color_icon_on_white;
            if (intValue != 1) {
                i3 = R.attr.igds_color_secondary_text_on_media;
            }
            i = AbstractC53242c7.A0H(context, i3);
        } else {
            i = R.color.audio_bar_action_color_enabled;
        }
        int color = context.getColor(i);
        Integer num2 = C05F.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C14360o3.A08(typeface);
        return new C25317BIm(context, AbstractC14710oj.A03(null, typeface, num2), drawable, spannableStringBuilder, userSession, i2, color);
    }

    public static final void A05(UserSession userSession, final InterfaceC105144oU interfaceC105144oU, C105154oV c105154oV, C92584Cs c92584Cs) {
        C14360o3.A0B(c92584Cs, 1);
        A00.A06(userSession, c105154oV, c92584Cs);
        if (interfaceC105144oU != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.4oW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(108615141);
                    InterfaceC105144oU interfaceC105144oU2 = InterfaceC105144oU.this;
                    C14360o3.A0A(view);
                    interfaceC105144oU2.DUB(view);
                    C0f9.A0C(-2034259141, A05);
                }
            };
            View.OnTouchListener DUD = interfaceC105144oU.DUD();
            ViewGroup viewGroup = c105154oV.A01;
            View view = c105154oV.A03;
            if (viewGroup != null) {
                C0fQ.A00(onClickListener, viewGroup);
                if (DUD != null) {
                    viewGroup.setOnTouchListener(DUD);
                }
                view = c105154oV.A02;
                if (view == null) {
                    return;
                }
            } else {
                if (view == null) {
                    return;
                }
                C0fQ.A00(onClickListener, view);
                if (DUD != null) {
                    view.setOnTouchListener(DUD);
                }
            }
            AbstractC56952jT.A04(view, C05F.A01);
        }
    }

    public static final C92584Cs A03(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str = musicOverlayStickerModel.A0Y;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = musicOverlayStickerModel.A0m;
        if (str3 != null) {
            str2 = str3;
        }
        boolean z = false;
        if (musicOverlayStickerModel.A05 != null) {
            z = true;
        }
        return new C92584Cs(null, null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, z, musicOverlayStickerModel.A0s, false, false, true, true, musicOverlayStickerModel.A0t, false, false);
    }

    public static final void A04(UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, C105154oV c105154oV) {
        A00.A06(userSession, c105154oV, A03(musicOverlayStickerModel));
    }

    private final void A06(UserSession userSession, C105154oV c105154oV, C92584Cs c92584Cs) {
        InterfaceC09390do interfaceC09390do;
        TextView textView;
        ViewStub viewStub = c105154oV.A09;
        if (viewStub != null && c105154oV.A01 == null) {
            ImageView imageView = null;
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            c105154oV.A01 = viewGroup;
            if (viewGroup != null) {
                textView = (TextView) viewGroup.findViewById(R.id.music_attribution_label);
            } else {
                textView = null;
            }
            c105154oV.A03 = textView;
            ViewGroup viewGroup2 = c105154oV.A01;
            if (viewGroup2 != null) {
                imageView = (ImageView) viewGroup2.findViewById(R.id.music_attribution_label_marquee);
            }
            c105154oV.A02 = imageView;
        }
        ViewGroup viewGroup3 = c105154oV.A01;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        C92584Cs c92584Cs2 = c105154oV.A05;
        c105154oV.A05 = c92584Cs;
        if (!C14360o3.A0K(c92584Cs, c92584Cs2)) {
            Resources resources = c105154oV.A08;
            SpannableStringBuilder A03 = C92604Cu.A03(resources, (Drawable) c105154oV.A0C.getValue(), (Drawable) c105154oV.A0A.getValue(), userSession, c92584Cs, true);
            if (c105154oV.A03 != null) {
                Context context = c105154oV.A07;
                boolean z = c92584Cs.A0A;
                boolean z2 = c92584Cs.A06;
                if (z) {
                    interfaceC09390do = c105154oV.A0F;
                } else if (z2) {
                    interfaceC09390do = c105154oV.A0B;
                } else if (c105154oV.A0G) {
                    interfaceC09390do = c105154oV.A0D;
                } else {
                    interfaceC09390do = c105154oV.A0E;
                }
                Drawable drawable = (Drawable) interfaceC09390do.getValue();
                c105154oV.A00 = drawable;
                if (drawable != null) {
                    TextView textView2 = c105154oV.A03;
                    if (textView2 != null) {
                        if (z) {
                            Context context2 = textView2.getContext();
                            C14360o3.A07(context2);
                            C92604Cu.A05(context2, drawable, A03, c92584Cs, R.dimen.music_attribution_trending_icon_size);
                        } else {
                            Drawable drawable2 = null;
                            if (c92584Cs.A0C) {
                                drawable2 = drawable;
                            }
                            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        if (c92584Cs.A0C) {
                            C92604Cu.A06(context, drawable, c92584Cs);
                            textView2.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
                            textView2.setPaddingRelative(c105154oV.A06 + textView2.getPaddingStart(), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
                        }
                        textView2.setText(A03);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (c105154oV.A02 == null) {
                return;
            }
            ViewGroup viewGroup4 = c105154oV.A01;
            if (viewGroup4 != null) {
                Context applicationContext = viewGroup4.getContext().getApplicationContext();
                C14360o3.A07(applicationContext);
                C25317BIm A02 = A02(applicationContext, A03, userSession, c92584Cs, C05F.A00);
                A02.A00();
                c105154oV.A04 = A02;
                ImageView imageView2 = c105154oV.A02;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(A02);
                    ImageView imageView3 = c105154oV.A02;
                    if (imageView3 != null) {
                        imageView3.setContentDescription(A03.toString());
                    }
                    Drawable drawable3 = c105154oV.A00;
                    if (drawable3 instanceof C138586Po) {
                        C14360o3.A0C(drawable3, "null cannot be cast to non-null type com.instagram.music.common.ui.MusicSoundWaveDrawable");
                        C138586Po c138586Po = (C138586Po) drawable3;
                        c138586Po.A05 = true;
                        c138586Po.invalidateSelf();
                    }
                    ImageView imageView4 = c105154oV.A02;
                    if (imageView4 == null) {
                        return;
                    }
                    imageView4.addOnAttachStateChangeListener(new AQ5(c105154oV));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final BitmapDrawable A07(Context context, Integer num) {
        int dimension = (int) context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
        Bitmap A002 = AbstractC27488CBj.A00(A00(context, num, R.drawable.instagram_music_effects_pano_filled_24), dimension, dimension);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return new BitmapDrawable(resources, A002);
    }
}
