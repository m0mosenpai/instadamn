package com.instagram.music.common.model;

import X.AbstractC09440dt;
import X.AbstractC31171DnF;
import X.C00O;
import X.C14360o3;
import X.C57526Pg0;
import X.InterfaceC09390do;
import X.InterfaceC43451JHp;
import X.JM8;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import java.util.List;

/* loaded from: classes7.dex */
public final class MusicSearchPlaylist implements Parcelable, InterfaceC43451JHp {
    public JM8 A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C57526Pg0(this, 42));

    @Override // X.InterfaceC43451JHp
    public final AudioBrowserCategoryType Amc() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String valueOf;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(A00().BEx(), i);
        parcel.writeString(A00().getId());
        if (A00().Be7() == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(A00().Be7());
        }
        parcel.writeString(valueOf);
        parcel.writeList(AbstractC31171DnF.A0n(this.A01));
        parcel.writeString(A00().getTitle());
    }

    public final JM8 A00() {
        JM8 jm8 = this.A00;
        if (jm8 != null) {
            return jm8;
        }
        C14360o3.A0F("data");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43451JHp
    public final List Bfr() {
        return AbstractC31171DnF.A0n(this.A01);
    }

    public MusicSearchPlaylist(JM8 jm8) {
        this.A00 = jm8;
    }

    public final MusicSearchPlaylistType A01() {
        AudioBrowserPlaylistType Be7 = A00().Be7();
        if (Be7 != null) {
            int ordinal = Be7.ordinal();
            if (ordinal != 1) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 8) {
                            if (ordinal == 9) {
                                return MusicSearchPlaylistType.A07;
                            }
                        } else {
                            return MusicSearchPlaylistType.A06;
                        }
                    } else {
                        return MusicSearchPlaylistType.A05;
                    }
                } else {
                    return MusicSearchPlaylistType.A04;
                }
            } else {
                return MusicSearchPlaylistType.A02;
            }
        }
        return MusicSearchPlaylistType.A03;
    }

    @Override // X.InterfaceC43451JHp
    public final String getId() {
        return A00().getId();
    }

    @Override // X.InterfaceC43451JHp
    public final String getTitle() {
        return A00().getTitle();
    }
}
